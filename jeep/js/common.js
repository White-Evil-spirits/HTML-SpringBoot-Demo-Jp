var api = 'http://127.0.0.1:8080/'
var baseUrl = 'http://www.leige.tech/'
var loginUrl = 'http://127.0.0.1:8848/html_/index.html';
//下次再发ajax请求把token带到后台


$(function(){
	var token = $.cookie('TOKEN');
	var userinfo = $.cookie('USERINFO');
	// console.log($.cookie('TOKEN'))
	//设置全局ajax前置拦截
	$.ajaxSetup({
		headers: {
			'TOKEN': token, //每次ajax请求时把token带过去
			'USERINFO': userinfo
		}
	});
	console.log(token)
	console.log(userinfo)
	//如果访问登陆页面这外的页面并且还没有登陆成功之后写入cookie的token就转到登陆页面
	if (token == undefined) {
		if (window.location != loginUrl) {
			window.location.href = loginUrl;
		}
	} 
})





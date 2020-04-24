	//微信显示
	function onweixin(){
		$("#weixin-onms").css("display","block");
	}
	function outweixin(){
		$("#weixin-onms").css("display","none");
	}
	
	
	function xieyi()
	{
		var zhuangtai=$("#zc-xieyi").prop('checked');
		if(zhuangtai==true)
		{
			$("#tj").css("backgroundColor","#ffb400");
		}
		if(zhuangtai==false)
		{
			$("#tj").css("backgroundColor","#7c7c7c");
		}
	}
	
	
	function anniu()
	{
		var zhuangtai=$("#zc-xieyi").prop('checked');
		if(zhuangtai==true)
		{
			$("#tj").removeAttr("disabled");
		}
		if(zhuangtai==false)
		{
			$("#tj").attr("disabled","disabled");
		}
	}
	
	/* ===================================================================================  正则 */
	/* 姓名 */
	function uname()
	{
		var uname=$(".ze1-2").val();
		var zuname = /^[\u4E00-\u9FA5]{1,6}$/;
		if(zuname.test(uname))
		{
			$(".ze1-1").attr("class","form-group ze1-1 has-success");
			$(".ze1-2").attr("id","inputSuccess");
		}else{
			$(".ze1-1").attr("class","form-group ze1-1 has-error");
			$(".ze1-2").attr("id","inputError");
			/* alert("输入中文姓名！"); */
			$("#alert-1").html("输入中文姓名!<div id='okokok' onclick='alertt()' style='cursor: pointer; width: 100px; height: 40px; margin: 0 auto; background-color: #ffb400; margin-top: 35px; text-align: center; line-height: 40px;'>确定</div>");
			$("#alert-2").css("display","block");
			
		}
	}
	
	/* 密码 */
	function upwd()
	{
		
		var zupwd=/^[0-9a-zA-Z_]{6,15}$/;
		var upwd=$(".ze2-2").val();
		 console.log(zupwd.test(upwd)); 
		if(zupwd.test(upwd))
		{
			$(".ze2-1").attr("class","form-group ze2-1 has-success");
			$(".ze2-2").attr("id","inputSuccess");
		}else{
			$(".ze2-1").attr("class","form-group ze2-2 has-error");
			$(".ze2-2").attr("id","inputError");
			/* alert("密码格式错误！"); */
			$("#alert-1").html("密码格式错误!<div id='okokok' onclick='alertt()' style='cursor: pointer; width: 100px; height: 40px; margin: 0 auto; background-color: #ffb400; margin-top: 35px; text-align: center; line-height: 40px;'>确定</div>");
			$("#alert-2").css("display","block");
		}
	}
	
	/* 确认密码 */
	function qpwd()
	{
		var upwd=$(".ze2-2").val();
		var qpwd=$(".ze3-2").val();
		console.log(qpwd==upwd);
		if(qpwd==upwd)
		{
			$(".ze3-1").attr("class","form-group ze3-1 has-success");
			$(".ze3-2").attr("id","inputSuccess");
		}else{
			$(".ze3-1").attr("class","form-group ze3-2 has-error");
			$(".ze3-2").attr("id","inputError");
			/* alert("两次密码不一致！"); */
			$("#alert-1").html("两次密码不一致!<div id='okokok' onclick='alertt()' style='cursor: pointer; width: 100px; height: 40px; margin: 0 auto; background-color: #ffb400; margin-top: 35px; text-align: center; line-height: 40px;'>确定</div>");
			$("#alert-2").css("display","block");
		}
	}
	
	
	/* 身份证号 */
	function shenfen()
	{
		var zusf=;
		var usf=$(".ze4-2").val();
		if(zusf.test(usf))
		{
			$(".ze4-1").attr("class","form-group ze4-1 has-success");
			$(".ze4-2").attr("id","inputSuccess");
		}else{
			$(".ze4-1").attr("class","form-group ze4-2 has-error");
			$(".ze4-2").attr("id","inputError");
			/* alert("身份证号格式不正确！"); */
			$("#alert-1").html("身份证号格式不正确!<div id='okokok' onclick='alertt()' style='cursor: pointer; width: 100px; height: 40px; margin: 0 auto; background-color: #ffb400; margin-top: 35px; text-align: center; line-height: 40px;'>确定</div>");
			$("#alert-2").css("display","block");
		}
	}
	
	/* 手机号正则 */
	function sjh()
	{
		var zsjh=/^1[34578]\d{9}$/;
		var usjh=$(".ze5-2").val();
		if(zsjh.test(usjh))
		{
			$(".ze5-1").attr("class","form-group ze5-1 has-success");
			$(".ze5-2").attr("id","inputSuccess");
		}else{
			$(".ze5-1").attr("class","form-group ze5-2 has-error");
			$(".ze5-2").attr("id","inputError");
			/* alert("手机号不正确！"); */
			$("#alert-1").html("手机号不正确!<div id='okokok' onclick='alertt()' style='cursor: pointer; width: 100px; height: 40px; margin: 0 auto; background-color: #ffb400; margin-top: 35px; text-align: center; line-height: 40px;'>确定</div>");
			$("#alert-2").css("display","block");
		}
	}
	
	
				var b1;
				var b2;
				var bprovnice = ['山东','北京','安徽'];
				var bcity =[['淄博','济南','荆门'],['南京','无锡','镇江'],['合肥','安庆','黄山']];
				var bcountry =[[['淄川','武汉2'],['黄冈1','黄冈2'],['荆门1','荆门2']],[['南京1','南京2'],['无锡1','无锡2'],['镇江1','镇江2']],[['合肥1','合肥2'],['安庆1','安庆2'],['黄山1','黄山2']]];
		
				$(function () { for(var i=0;i<bprovnice.length;i++){ 
				$('#shengfen-2-select').append('<option>'+bprovnice[i]+'</option>');
							};
							$('#shengfen-2-select').change(function () { $('#form-city-select').children().not(':eq(0)').remove();
								
					$('#jingxiaoshang-select').children().not(':eq(0)').remove();
									b1 = $(this).children('option:selected').index();
									var abcity = bcity[b1-1];
									
					for(var j=0;j<abcity.length;j++){ 
						$('#form-city-select').append('<option>'+abcity[j]+'</option>');
						} });
						
							$('#form-city-select').change(function () { $('#jingxiaoshang-select').children().not(':eq(0)').remove();
				
									b2 = $(this).children('option:selected').index();
					
									var abcountry = bcountry[b1-1][b2-1];
					
									for(var k=0;k<abcountry.length;k++){ 
							$('#jingxiaoshang-select').append('<option>'+abcountry[k]+'</option>');
						} }) }) 
									
									
									
									
		/* 关闭提示框 */
		function alertt()
		{
			$("#alert-2").css("display","none");
		}
		
		
		/* 注册成功 */
		
		/* 注册成功按钮功能 */
		function okanniu()
		{
			location.href="";
		}
		
		
		function zcok()
		{
			
		}

	//微信显示
	function onweixin(){
		$("#weixin-onms").css("display","block");
	}
	function outweixin(){
		$("#weixin-onms").css("display","none");
	}
	
	
	/* 汽车展示柜 */
	
	function showcar(id)
	{
		$(".big-img").css("display","none");
		$(".big-img").eq(id).css("display","block");
	}
	
	window.onload=function()
	{
		
	}
	
	
	/* 选择汽车配置动画 */
	var car=null;
	var colo=null;
	function pz(id)
	{
		car=$("#car-name-li li").eq(id).html();
		
		$(".lidh").css("border","1px solid #808080");
		$(".lidh").css("color","black");
		$(".lidh").css("backgroundColor","#ffffff");
		
		$(".lidh").eq(id).css("backgroundColor","#ffb400");
		$(".lidh").eq(id).css("border","1px solid #ffb400");
		$(".lidh").eq(id).css("color","#ffffff");
		console.log(car);
	}
	
	function onmos(id)
	{
		$(".lidh").css("border","1px solid #808080");
		$(".lidh").eq(id).css("border","1px solid #ffb400");
	}
	
	function outmos()
	{
		var i=0;
		$(".lidh").css("border","1px solid #808080");
/* 		$(".lidh").each(function(i){
			console.log($(this).css("borderColor"));
			alert($(this).css("borderColor"));
			i++;
		}); */
	}
	
	/* 选择汽车颜色动画 */

	function color(id)
	{
		colo=$("#car-color-li li").eq(id).html();	
		
		$(".lidh2").css("border","1px solid #808080");
		$(".lidh2").css("color","black");
		$(".lidh2").css("backgroundColor","#ffffff");
		
		$(".lidh2").eq(id).css("backgroundColor","#ffb400");
		$(".lidh2").eq(id).css("border","1px solid #ffb400");
		$(".lidh2").eq(id).css("color","#ffffff");
		console.log(colo);
	}
	
		function onmos2(id)
		{
			$(".lidh2").css("border","1px solid #808080");
			$(".lidh2").eq(id).css("border","1px solid #ffb400");
		}
		
		function outmos2()
		{
			var i=0;
			$(".lidh2").css("border","1px solid #808080");
/* 	 		$(".lidh").each(function(i){
				console.log($(this).css("border"));
				i++;
				console.log(i);
			}); */
			/* var c=$(".lidh2").css("border-color");
			console.log(c); */
		}
	
	/* 汽车配置标题li */
	function btli(id,imgid)
	{
		$(".lidh3").css("background-color","#ebebeb");
		$(id).css("background-color","#f6c645");
		$(".bottom-img").css("display","none");
		$(".bottom-img").eq(imgid).css("display","block");
	}

/* 左侧下拉动画 */
var height1=0;
var height2=0;
function carkh()
{
	if(height1==1)
	{
		$("#cark").animate({height:'44px'});
		$("#cark-name").css("background-image","url(image/jeepadmin/arrow_black.png)");
		height1=0;
	}
	else
	{
		$("#cark").animate({height:'158px'});
		$("#cark-name").css("background-image","url(image/jeepadmin/arrow_black2.png)");
		height1++;
	}
}

/* 订单 */
function carding()
{
	if(height2==1)
	{
		$("#carding").animate({height:'44px'});
		$("#carding-name").css("background-image","url(image/jeepadmin/arrow_black.png)");
		height2=0;
	}
	else
	{
		$("#carding").animate({height:'87px'});
		$("#carding-name").css("background-image","url(image/jeepadmin/arrow_black2.png)");
		height2++;
	}
}


/* 事实查看现状 */
var carname=null;
var pname=null;
var colorname=null;
function lookx(id){
	$(".huoqucar").css("backgroundColor","#ffffff");
	$(".huoqucar").css("color","black");
	$(".huoqucar").eq(id).css("backgroundColor","#ffb400");
	$(".huoqucar").eq(id).css("color","#ffffff");
	$("#xxsp1").html("");
	$("#xxsp2").html("");
	$("#xxsp3").html("");
	var str=$(".huoqucar").eq(id).html();
	$("#xxsp1").html(str);
	
}

function lookp(id)
{
	$(".huoqup").css("backgroundColor","#ffffff");
	$(".huoqup").css("color","black");
	$(".huoqup").eq(id).css("backgroundColor","#ffb400");
	$(".huoqup").eq(id).css("color","#ffffff");
	$("#xxsp2").html("");
	$("#xxsp3").html("");
	var str=$(".huoqup").eq(id).html();
	$("#xxsp2").html("&nbsp;&nbsp>>&nbsp;&nbsp"+str);
}

function lookc(id)
{
	$(".huoqucolor").css("backgroundColor","#ffffff");
	$(".huoqucolor").css("color","black");
	$(".huoqucolor").eq(id).css("backgroundColor","#ffb400");
	$(".huoqucolor").eq(id).css("color","#ffffff");
	var str=$(".huoqucolor").eq(id).html();
	$("#xxsp3").html("");
	$("#xxsp3").html("&nbsp;&nbsp>>&nbsp;&nbsp"+str);
}
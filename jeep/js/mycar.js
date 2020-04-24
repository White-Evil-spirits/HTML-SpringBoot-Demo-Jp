	//微信显示
	function onweixin(){
		$("#weixin-onms").css("display","block");
	}
	function outweixin(){
		$("#weixin-onms").css("display","none");
	}
	

	var ajx=0;
	/* 全选   全不选 */
	function allcbox(){  
		
	  if($("#all").prop("checked")){
		$("[name='aaa']").prop("checked", true); 
		/* 循环 获取 */
		 	 		$("[name='aaa']").each(function(i){
						ajx++;
						$("#jiagehtml").html(ajx*8.8);
					});
	  }else{  
	  $("[name='aaa']").prop("checked", false);

	  	$("#jiagehtml").html(0);
			ajx=0;
	  }  
	}
	var j=0;
	
	
	/* 选择一个 */
	function onecbox()
	{
		
		var js=0;
		var i=0;
		/* console.log(i); */
/* 		$("[name='aaa']").each(function(i){
			if($("[name='aaa']").prop("checked"))
			{
				i++;
				console.log(i);
				$("#jiagehtml").html(i*8.8);
			}
			else
			{
				console.log(i);
				$("#jiagehtml").html(0);
			}
		}); */
		
		var names=document.getElementsByName("aaa");
		var id=document.getElementById('jiagehtml');
		/* console.log(names[0].checked); */
		for(var k=0;k<names.length;k++)
		{
			/* console.log(names[k].checked); */
			if(names[k].checked)
			{
				js++;
				id.innerHTML=js*8.8;
				/* console.log(i*8.8); */
				j=parseFloat(id.innerHTML);
				console.log(j);
			}/* else{	
				id.innerHTML=j-8.8;
			} */
			if(js==0)
			{
				id.innerHTML=0;
			}
		}
	}

	
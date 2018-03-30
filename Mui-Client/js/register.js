mui('body').on('tap','#register',function() {
	mui.ajax('http://127.0.0.1:8080/mobile/action/userActionAdd.mc',{
		data:{
			userid:document.getElementById("id").value,
			user:document.getElementById("name").value
		},
		dataType:'string',
		type:'post',//HTTP请求类型
		timeout:10000,//超时时间设置为10秒；           
		success:function(data){
			//服务器返回响应，根据响应结果，分析是否登录成功；
			 if(data == "true"){
     	        mui.alert('填录成功'); 
     	       document.getElementById("id").value="";
     	      document.getElementById("name").value="";
     	        }
     	        else {
                 mui.alert('填录失败');
     	        }

		},
		error:function(xhr,type,errorThrown){
			//异常处理；
			mui.alert('填录失败');
			console.log(type);
		}
	});
})

mui('body').on('tap','#clear',function() {
	document.getElementById("id").value="";
     document.getElementById("name").value="";
})
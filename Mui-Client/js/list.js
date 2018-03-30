mui.init(
		mui.ajax('http://192.168.2.109:8080/mobile/action/userActionFind.do',{
			data:{	
			},
			dataType:'string',
			type:'post',//HTTP请求类型
			timeout:10000,//超时时间设置为10秒；
			headers:{'Content-Type':'application/json'},
			success:function(data){
				//服务器返回响应，根据响应结果，分析是否登录成功；			
				 var result=eval(data);
				 var list=document.getElementById('list');
				 var li = document.createElement("li");
				 li.setAttribute("userid", "user");
				 li.innerHTML="";
				for(var i = 0;i < result.length;i++){
				li.innerHTML=li.innerHTML+
				"<li class='mui-table-view-cell'>" +
				"<div class='mui-slider-cell'>" +
				"<div class='oa-contact-cell mui-table'>" +
				"<div class='oa-contact-content mui-table-cell'>" +
				"<div class='mui-clearfix'>" +
				"<h4 class='oa-contact-name'>ID："+result[i].userid+"</h4></div>"+
				"<p class='oa-contact-email mui-h6'>NAME:"+result[i].user+"</p></div></div></div></li>"
				}
				list.appendChild(li);
			},
			error:function(xhr,type,errorThrown){
				//异常处理；
				mui.alert('填录失败');
				console.log(type);
			}
		})
)
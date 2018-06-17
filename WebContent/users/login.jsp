<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<style type="text/css" media="screen">
#main {
	position: absolute;
	margin-top: 100px;
}

#left {
	margin-left: 300px;
}

.font {
	font-size: 14px;
}

label.error {
	background: url(../img/unchecked.gif) no-repeat 10px 3px;
	padding-left: 30px;
	font-family: georgia;
	font-size: 15px;
	font-style: normal;
	color: red;
}

.active {
	/* border: 1px solid #79b7e7; */
	background: #f5f8f9 repeat-x;
	font-weight: bold;
	color: #e17009
}
</style>


<script type="text/javascript" src="./js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="./js/jquery.validate.min.js"></script>
<script type="text/javascript" src="./js/messages_zh.js"></script>
<script>
	$(function() {
		$("#login").validate({
			rules : {
				username : {
					required : true,
					minlength : 6
				},
				password : {
					required : true,
					minlength : 6
				}

			},
			messages : {
				username : {
					required : "用户名不能为空",
					minlength : "用户名不得少于6位"
				},
				password : {
					required : "密码不能为空",
					minlength : "密码不得少于6位"
				}
			
			},
			errorElement : "label", //用来创建错误提示信息标签,validate插件默认的就是label
			success : function(label) { //验证成功后的执行的回调函数
				//label指向上面那个错误提示信息标签label
				label.text(" ") //清空错误提示消息
				.addClass("success"); //加上自定义的success类
			}
		
	    });

	});
</script>
</head>
<body>
	<div id="main" style="width: 100%; height: auto;">
		<div id="left" style="float: left; width: 300px; height: 100%;">
			<img alt="插图" src="./images/登录页面插图.jpg"
				style="width: 250px; height: 400px">
		</div>
		<div id="right" style="float: left; width: 500px; height: 100%;">
			<div style="width:400px,height:140px">
				<img alt="平台Logo" src="./images/logo.png"
					style="width: 250px; height: 140px;">
				<a href="home.jsp"><img title="点我进入主页" alt="进入主页" src="./images/云.jpg"  style="position:fixed;top:-10px;width:400px;height:300px"></a>
			</div>
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="font active">登录</span>
				&nbsp;&nbsp;&nbsp;&nbsp; <span>|</span> &nbsp;&nbsp;&nbsp; <a href="register.jsp" style="color:#000;text-decoration: none"><span
					class="font ">注册</span></a> <br /> <br />
	
	
				<form id="login" action="#" method="get">
					<input type="text" name="username" placeholder="账号"
						style="width: 250px; height: 30px"> <br /> <br /> <input
						type="password" name="password" placeholder="密码"
						style="width: 250px; height: 30px"> <br /> <span
						style="font-size: 13px; color: #bbb">当账号不存在时，将为您跳转注册页面</span><br />
					<a
						style="font-size: 13px; position: absolute; right: 500px; color: blue"
						href="register.jsp">前往注册>></a><br />
					<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
						value="登录" onclick="check()" color="#fff" bgcolor="#4cd964"
						style="width: 100px; border-radius: 20px; background-color: #85E6C7">
				</form>
			</div>

		</div>

	
	<div style="width: auto; height: auto">
		<footer style="position: fixed; bottom:0px; left:0px;"> <span>
			&copy;开发者:李旭锐&nbsp陈妙纯&nbsp周佩蓉&nbsp<a
			href="https://github.com/wap2017/Meituan.git" target="_blank"
			title="访问博客">github入口</a>
		</span> </footer>
	</div>
	<div class="clear" style="clear: both;"></div>
	</div>
	
	<script type="text/javascript">
        function check() {
            var uNickname = $.trim($('input[name=username]').val());
            var label = $('.error').val();
            var pwd = $.trim($('input[name=password]').val());
            if ("" == uNickname || "" == pwd) {
                alert('用户名或者密码不能为空');
            }
            if(label!=""){
            	alert('请填写正确的信息');
            }
            else {
            	var data ={
            			"uNickname":uNickname,
            			"pwd":pwd
            			}
                $.ajax({
                    type : 'post',
                    url : "../user/login.action",
                    contentType:'application/json;charset=UTF-8',
                    data:JSON.stringify(data),
                    success : function(msg) {
                        if('success'==msg){
                        	/* alert("注册成功"); */
                            location.href='home.jsp' ; 
                        }else if('密码错误'==msg){
                        	alert(msg);
                        }else{
                        	alert(msg);
                        	location.href='register.jsp' ; 
                        }
                    }
                });
                  
            }
        }
    </script>
</body>
</html>

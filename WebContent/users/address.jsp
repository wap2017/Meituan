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
	background: #f5f8f9
		
		repeat-x;
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
					digits : true,
					minlength : 6
				},
				repassword : {
					required : true,
					equalTo : "[name='password']"
				},

			},
			messages : {
				username : {
					required : "用户名不能为空",
					minlength : "用户名不得少于6位"
				},
				password : {
					required : "密码不能为空",
					minlength : "密码不得少于6位"
				},
				repassword : {
					required : "密码不能为空",
					equalTo : "两次密码不一致"
				},
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
	<div id="main" style="width: 100%; height: 400px;">
		<div id="left" style="float: left; width: 40%; height: 100%;">
			<img alt="插图" src="./images/登录页面插图.jpg"
				style="width: 250px; height: 400px">
		</div>
		<div id="right" style="float: left; width: 60%; height: 100%;"></div>
		<img alt="平台Logo" src="./images/logo.png"
			style="width: 250px; height: 140px"> <br />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="font active">登录</span>
		&nbsp;&nbsp;&nbsp;&nbsp; <span>|</span> &nbsp;&nbsp;&nbsp; <span
			class="font ">注册</span> <br /> <br />
		
		
		<form id="login" action="#" method="get">
			<input type="text" name="username" placeholder="账号"
				style="width: 250px; height: 30px"> <br /> <br /> <input
				type="password" name="password" placeholder="密码"
				style="width: 250px; height: 30px"> <br /> 
			<span style="font-size:13px;color:#bbb">当账号不存在时，将为您跳转注册页面</span><br/>
			<a	style="font-size:13px; position: absolute;right: 250px;color:blue" href="register.jsp">前往注册>></a><br/><br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			 <input type="button" value="登录" color="#fff"
				bgcolor="#4cd964"
				style="width: 100px; border-radius: 20px; background-color: #85E6C7">
		</form>
		



	</div>
	<div class="clear" style="clear: both;"></div>
</body>
</html>

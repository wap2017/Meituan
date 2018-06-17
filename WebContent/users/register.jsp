<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
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
		$("#register").validate({
			rules : {
				uNickname : {
					required : true,
					minlength : 6
				},
				password : {
					required : true,
					minlength : 6
				},
				repassword : {
					required : true,
					equalTo : "[name='password']"
				},

			},
			messages : {
				uNickname : {
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
	<div id="main" style="width: auto; height: auto;">
		<div id="left" style="float: left; width: 300px; height: 100%;">
			<img alt="插图" src="./images/登录页面插图.jpg"
				style="width: 250px; height: 400px">
		</div>
		<div id="right" style="float: left; width: 500px; height: 100%;">
			<img alt="平台Logo" src="./images/logo.png"
				style="width: 250px; height: 140px"> <br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="login.jsp" style="color:#000;text-decoration: none"><span class="font ">登录</span></a>
			&nbsp;&nbsp;&nbsp;&nbsp; <span>|</span> &nbsp;&nbsp;&nbsp; <span
				class="font active">注册</span> <br /> <br />


			<form id="register" action="../user/register1.action" method="post">
				<input type="text" name="uNickname" placeholder="账号"
					style="width: 250px; height: 30px"> <br /> <br /> <input
					type="password" name="password" placeholder="密码"
					style="width: 250px; height: 30px"> <br /> <br /> <input
					type="password" name="repassword" placeholder="确认密码"
					style="width: 250px; height: 30px"> <br /> <br /> <br />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
					value="注册" onclick="check()" color="#fff" bgcolor="#4cd964"
					style="width: 100px; border-radius: 20px; background-color: #85E6C7">

			</form>

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
            var uNickname = $.trim($('input[name=uNickname]').val());
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
                    url : "../user/register1.action",
                    contentType:'application/json;charset=UTF-8',
                    data:JSON.stringify(data),
                    success : function(msg) {
                        if('success'==msg){
                        	alert("注册成功");
                            location.href='login.jsp' ; 
                        }else{
                           /*  $('#msg').html(msg); */
                            alert(msg);
                        }
                    }
                });
                  
            }
        }
    </script>

</body>
</html>

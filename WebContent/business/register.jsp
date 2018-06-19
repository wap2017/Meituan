<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快点慢吃商家中心</title>
<link href="css/register.css" rel="stylesheet">
</head>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/jquery.citySelect.js"></script>
<script type="text/javascript">
$(function(){
	$("#city").citySelect({
    	prov:"广东", 
    	city:"广州",
		dist:"荔湾区",
		nodata:"none"
	}); 
});
</script>
<script type="text/javascript">
function OpenDiv1(){
	document.getElementById("kw-modal-container").style.display="block";
	document.getElementById("loginDiv").style.display="none";
	}
function OpenDiv2(){
	document.getElementById("kw-modal-container").style.display="none";
	document.getElementById("regDiv").style.display="block";
	}
function OpenDiv3(){
	document.getElementById("kw-modal-container").style.display="none";
	document.getElementById("regDiv").style.display="none";
	document.getElementById("loginDiv").style.display="block";
	}
function closeDiv(){
	document.getElementById("regDiv").style.display="none";
	document.getElementById("loginDiv").style.display="none";
}
</script>
<body id="registerBody">
	<div class="opendiv">
		<input type="button" class="openButton" value="注册开店" onclick="javascript:OpenDiv1();">
		<input type="button" class="openButton" value="直接登录" onclick="javascript:OpenDiv3();">
	</div>
	<div id="kw-modal-container">
		<div class="kw-modal-header">
			<span>请选择你店铺所在的城市</span>
		</div>
			<div id="city">
				<select class="prov"></select> 
				<select class="city" disabled="disabled"></select>
				<select class="dist" disabled="disabled"></select>
		</div>
		<input type="button" value="确定" class="sure" onclick="javascript:OpenDiv2();">
	</div>
	<div id="regDiv">
		<div class="regTitle">
			<span>申请入驻</span>
		</div>
		<hr>
		<form class="inputMes" method="post" enctype="multipart/form-data"
					action="/register">
			<div class="inputText">
			<input type="text" placeholder="联系人手机号" name="phone"><br/>
			<input type="password" placeholder="输入密码" name="password"><br/>
			<input type="password" placeholder="再次输入密码" name="rePassword"><br/>
		</div>
		
			<input type="submit" value="注册" class="submit"><br/>
			<input type="button" value="取消" name="canel" onclick="javascript:closeDiv();">
		
		</form>
		</div>
		<div id="loginDiv">
		<div class="regTitle">
			<span>登录</span>
		</div>
		<hr>
		<form class="inputMes" method="post" enctype="multipart/form-data"
					action="/login">
			<div class="inputText">
			<input type="text" placeholder="联系人手机号" name="phone"><br/>
			<input type="password" placeholder="输入密码" name="password"><br/>
		</div>
			<input type="submit" value="登录" class="submit"><br/>
			<input type="button" value="取消" name="canel" onclick="javascript:closeDiv();">
		</form>
		</div>
		
</body>
</html>
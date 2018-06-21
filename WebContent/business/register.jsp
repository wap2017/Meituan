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
<body id="registerBody">
	<div class="opendiv">
		<input type="button" class="openButton" value="注册开店" onclick="javascript:OpenDiv1();">
		<input type="button" class="openButton" value="直接登录" onclick="javascript:OpenDiv3();">
	</div>
	
<form class="inputMes" method="post" enctype="multipart/form-data" action="../business/register.action">
	
<!-- 	选择地点                                                  -->
	<div id="kw-modal-container">
		<div class="kw-modal-header">
			<span>请选择你店铺所在的城市</span>
		</div>
			<div id="city">
				<select class="prov" name="sProvince"></select> 
				<select class="city" name="sCity" disabled="disabled"></select>
				<select class="dist" name="sAddress" disabled="disabled"></select>
		</div>
		<input type="button" value="确定" class="sure" onclick="javascript:OpenDiv2();">
	</div>
	
<!-- 	注册页面                              -->
	<div id="regDiv">
		<div class="regTitle">
			<span>申请入驻</span>
		<hr>
		</div>
			<div class="inputText">
			<input type="text" placeholder="店铺名" name="bShopname"><br/>
			<input type="text" placeholder="联系人手机号" name="sRphone"><br/>
			<input type="password" placeholder="输入密码" name="bAccountpassword"><br/>
			<input type="password" placeholder="再次输入密码" name="rebAccountpassword"><br/>
			</div>
		
			<input type="button" value="注册" class="submit" onclick="javascript:putData();"><br/>
			<input type="button" value="取消" name="canel" onclick="javascript:closeDiv();">
		</div>
<!-- 	上传资料页面                          	 -->
		<div id="dataDiv">
		<div class="regSuccess">
			请上传以下资料
		</div>
		<div class="data">
			<hr>
			<div class="up">
			<div class="dataPhoto">
				<h5>商家logo</h5>
				<div style="display: none" id="imgDiv1">
					<img alt="" src="" id="img1" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA1" type="file" id="txtSrc1" onChange="setImagePreview(this,'txtSrc1','imgDiv1','img1');"><br/>
			</div>
			<div class="dataPhoto">
				<h5>营业执照</h5>
				<div style="display: none" id="imgDiv2">
					<img alt="" src="" id="img2" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA2" type="file" id="txtSrc2" onChange="setImagePreview(this,'txtSrc2','imgDiv2','img2');"><br/>
			</div>
			<div class="dataPhoto">
				<h5>身份证正面照</h5>
				<div style="display: none" id="imgDiv3">
					<img alt="" src="" id="img3" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA3" type="file" id="txtSrc3" onChange="setImagePreview(this,'txtSrc3','imgDiv3','img3');"><br/>
			</div>
			</div>
			<div class="down">
			<div class="dataPhoto">
				<h5>身份证反面照</h5>
				<div style="display: none" id="imgDiv4">
					<img alt="" src="" id="img4" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA4" class="aaa" type="file" id="txtSrc4" onChange="setImagePreview(this,'txtSrc4','imgDiv4','img4');"><br/>
			</div>
			<div class="dataPhoto">
				<h5>卫生许可证</h5>
				<div style="display: none" id="imgDiv5">
					<img alt="" src="" id="img5" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA5" type="file" id="txtSrc5" onChange="setImagePreview(this,'txtSrc5','imgDiv5','img5');"><br/>
			</div>
			</div>
		</div>
			<input type="submit" value="确定上传" class="submit"><br/>
			<input type="button" value="取消" id="canel" onclick="javascript:closeDiv1();">
	</div>
	</form>
		
<!-- 		登录页面                                                      -->
		<div id="loginDiv">
		<div class="regTitle">
			<span>登录</span>
		</div>
		<hr>
		<form class="inputMes" method="post" enctype="multipart/form-data">
			<div class="inputText">
			<input type="text" placeholder="输入账号" name="lbId"><br/>
			<input type="password" placeholder="输入密码" name="lbAccountpassword"><br/>
		</div>
			<input type="button" value="登录" class="submit" onclick="javascript:submitL();"><br/>
			<input type="button" value="取消" name="canel" onclick="javascript:closeDiv();">
		</form>
		</div>
<script src="js/putPhoto.js"></script>
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
function closeDiv4(){
		var con=confirm("是否取消注册"); 
		if(con==true)
			document.getElementById("dataDiv").style.display="none";
}
function putData(){
	var bShopname = $.trim($('input[name=bShopname]').val());
	var sRphone = $.trim($('input[name=sRphone]').val());
	var bAccountpassword = $.trim($('input[name=bAccountpassword]').val());
	var rebAccountpassword = $.trim($('input[name=rebAccountpassword]').val());
	if(bShopname==""||sRphone==""||bAccountpassword==""||rebAccountpassword==""){
		alert("请将信息填完整！");
	}else{
		if(bAccountpassword!=rebAccountpassword){
			alert("两次密码不一样");
		}else{
			find1(sRphone);
		}
	}
}
function find1(id) {
	$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath }/business/verifyBId.action?bId="+id,
			async: false,
			contentType:"application/json;charset=utf-8",
			data:{},
			success:function(data){
				if(data==false)
					alert("手机号已经注册过");
				else{
					document.getElementById("regDiv").style.display="none";
					document.getElementById("dataDiv").style.display="block";
				}
			}
	});
}
function submitL(){
	var bId = $.trim($('input[name=lbId]').val());
	var bAccountpassword = $.trim($('input[name=lbAccountpassword]').val());
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath }/business/login.action?bId="+bId+"&bAccountpassword="+bAccountpassword,
		async: false,
		contentType:"application/json;charset=utf-8",
		data:{},
		success:function(data){
			
			if("登录成功"==data)
				window.location.href="../business/identification.action";
			else{
				alert(data);
			}
		}
	});
}
</script>
</body>
</html>
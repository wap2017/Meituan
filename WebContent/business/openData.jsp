<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/register.css" rel="stylesheet">
<script type="text/javascript">
function closeDiv(){
	window.location.href="register.jsp?backurl="+window.location.href;
}
</script>
</head>
<body id="registerBody">
	<form class="dataDiv" method="post" enctype="multipart/form-data"
					action="/uploadData">
		<div class="regSuccess">
			注册成功,请上传以下资料
		</div>
		<div class="data">
			<hr>
			<div class="up">
			<div class="dataPhoto">
				<h5>商家图片</h5>
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
			<div class="dataPhoto">
				<h5>身份证反面照</h5>
				<div style="display: none" id="imgDiv4">
					<img alt="" src="" id="img4" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA4" type="file" id="txtSrc4" onChange="setImagePreview(this,'txtSrc4','imgDiv4','img4');"><br/>
			</div>
			</div>
			<div class="down">
			<div class="dataPhoto">
				<h5>卫生许可证</h5>
				<div style="display: none" id="imgDiv5">
					<img alt="" src="" id="img5" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA5" type="file" id="txtSrc5" onChange="setImagePreview(this,'txtSrc5','imgDiv5','img5');"><br/>
			</div>
			<div class="dataPhoto">
				<h5>商店门面</h5>
				<div style="display: none" id="imgDiv6">
					<img alt="" src="" id="img6" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA6" type="file" id="txtSrc6" onChange="setImagePreview(this,'txtSrc6','imgDiv6','img6');"><br/>
			</div>
			<div class="dataPhoto">
				<h5>店内照片</h5>
				<div style="display: none" id="imgDiv7">
					<img alt="" src="" id="img7" name="图片预览" width="200" height="200"
						id="图片预览">
				</div>
				<input name="imgA7" type="file" id="txtSrc7" onChange="setImagePreview(this,'txtSrc7','imgDiv7','img7');"><br/>
			</div>
			</div>
		</div>
			<input type="submit" value="确定上传" class="submit"><br/>
			<input type="button" value="取消" id="canel" onclick="javascript:closeDiv();">
	</form>
</body>
	<script src="js/putPhoto.js"></script>
</html>
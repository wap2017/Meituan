<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">

<head>
<title>个人中心 --个人资料</title>

<link href="css/total_css.css" type="text/css" rel="stylesheet">


<script type="text/javascript">
	var formData = new FormData();
	formData.append('file', $('#input_file')[0].files[0]); //添加图片信息的参数
	formData.append('sizeid', 123); //添加其他参数
	$.ajax({
		url : '/material/uploadFile',
		type : 'POST',
		cache : false, //上传文件不需要缓存
		data : formData,
		processData : false, // 告诉jQuery不要去处理发送的数据
		contentType : false, // 告诉jQuery不要去设置Content-Type请求头
		success : function(data) {
			var rs = eval("(" + data + ")");
			if (rs.state == 1) {
				tipTopShow('上传成功！');
			} else {
				tipTopShow(rs.msg);
			}
		},
		error : function(data) {
			tipTopShow("上传失败");
		}
	})
</script>

</head>

<body>
	<div class="full-content-wrapper">
		<header id="menu" role="banner"> <!-- logo -->
		<div id="logo">
			<img alt="平台Logo" src="./images/logo2.jpg"
				style="width: 250px; height: 50px; float: left">
		</div>
		<!-- 首页  -->
		<div class="menu1" style="width: 250px; height: 50px; float: left">
			<a href="home.jsp"><span class="font">首页</span></a>
		</div>
		<!-- 我的订单 -->
		<div class="menu1" style="width: 250px; height: 50px; float: left">
			<a href="inmonth.jsp"><span class="font">我的订单</span></a>
		</div>
		<!-- 个人中心 -->
		<div class="menu1" style="width: 250px; height: 50px; float: left">
			<span class="font"><a href="mine.jsp">个人中心</a></span>
		</div>
		<!-- 退出登录 -->
		<div class="menu1">
			<a href="login.jsp"><span class="font">退出登录</span></a>
		</div>
		</header>
		<div class="container">
			<div id="search">
				<span id="addre">当前位置：仲恺农业工程学院</span><a href="#">[修改当前地址]</a>
			</div>
			<div class="wash-paper clearfix" id="profile">
				<nav class="profile-nav">
				<ul class="nav nav-list">
					<li><a href="mine.jsp"> <i class="icon-user"></i> 个人中心
					</a></li>
					<li class="divider"></li>
					<li class="nav-header">订单中心</li>
					<li><a href="inmonth.jsp"> <i
							class="icon-calendar icon-white"></i> 最近一个月
					</a></li>
					<li><a href="outmonth.jsp"> <i class="icon-list-alt"></i>
							一个月之前
					</a></li>
					<li class="divider"></li>
					<li class="divider"></li>

					<li class="nav-header">我的收藏</li>
					<li><a href="collection.jsp"> <i class="icon-heart"></i>
							我收藏的餐厅
					</a></li>
					<li class="divider"></li>
					<li class="nav-header">我的资料</li>
					<li class="active"><a href="private.html"> <i class="icon-list"></i> 个人资料
					</a></li>
					<li><a href="address.jsp"> <i class="icon-gift"></i> 地址管理
					</a></li>
				</ul>
				</nav>
				<div class="main-content">
					<div class="content-header">
						<h2>修改密码</h2>
					</div>
					<div class="content-inner profile-changepwd">
						<form class="form-horizontal" method="post" id="changepwd_form">
							<fieldset>
								<div class="control-group clear-fix">
									<label class="control-label" for=""><span
										class="required">*</span>原密码</label>
									<div class="controls">
										<input name="user[old_password]" id="sf_guard_user_old_pwd"
											type="password">
										<p class="help-block">(请输入现在正在使用的密码)</p>
									</div>
									<!--end input-->
								</div>
								<!--end clearfix-->
								<div class="control-group">
									<label class="control-label" for=""><span
										class="required">*</span>新密码</label>
									<div class="controls">
										<input name="user[new_password]" id="sf_guard_user_new_pwd"
											type="password">
										<p class="help-block">（请输入新密码）</p>
									</div>
									<!--end input-->
								</div>
								<!--end clearfix-->
								<div class="control-group clear-fix">
									<label class="control-label" for=""><span
										class="required">*</span>重复新密码</label>
									<div class="controls">
										<input name="user[repeat_new_password]"
											id="sf_guard_user_repeat_pwd" type="password">
										<p class="help-block">(请再输入一次新密码)</p>
									</div>
									<!--end input-->
								</div>
								<!--end clearfix-->
								<div class="form-actions">
									<button type="button" class="btn btn-yellow"
										id="sf_guard_user_changepwd_submit">提交更改</button>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="content-header">
						<h2>修改头像</h2>
					</div>
					<div class="content-inner profile-changepwd file-box">

						<!--<input type="text" id="imgfield" class="txt" placeholder="预览"><br /><br /><br />-->
						<input type="file" name="file" id="input_file"
							accept="image/gif,image/jpeg,image/jpg,image/png,image/svg"
							onchange="imgPreview(this)">
						<div id="pic">
							<img id="preview" />
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</div>
		</div>

	</div>


</body>

</html>
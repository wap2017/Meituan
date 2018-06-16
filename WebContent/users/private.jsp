<%@ page language="java"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<script type="text/javascript">
		</script>
		<title>个人中心 --个人资料</title>

		<meta name="description" content="饿了么是中国最专业的网上订餐平台，提供各类中式、日式、韩式、西式等优质美食，如肯德基网上订餐，麦当劳网上订餐等。">

		<link href="css/total_css.css" type="text/css" rel="stylesheet">
		<link rel="apple-touch-icon-precomposed" href="http://yanshi.sucaihuo.com/modals/0/12/demo/images/apple-touch-icon.png?v=2">
		<link rel="shortcut icon" href="http://yanshi.sucaihuo.com/modals/0/12/demo/images/favicon.ico?v=2" type="image/x-icon">
		<script src="./个人中心 - 订单中心-member_order_files/cdn_detect.js.下载"></script>
		<script>
			if (!window.CDNReady) {
				var d = new Date;
				d.setHours(d.getHours() + 6);
				document.cookie = "CDNDown=1; domain=ele.me; expires=" + d.toUTCString() + "; path=/";
				if (!window.localStorage.getItem("CDNBackup")) {
					window.localStorage.setItem("CDNBackup", 1);
					location.reload(true)
				}
			}
		</script>
		<script type="text/javascript">
			var ma = "profile/order";
			var logined = true;
			var eleme = eleme || {};
			var start_time = new Date().getTime();
			var current_username = 'hjl416148489';
			eleme.logined = eleme.logined || true;
			eleme.ma = eleme.ma || "profile/order";
			eleme.place_id = eleme.place_id || "-615736186413943440";
			eleme.sessionId = "1a040c781726139937fd8ce009e95cc1";
			eleme.staticHost = "http://static10.elemecdn.com";
			eleme.host = "ele.me";
			eleme.api_host = "api.ele.me";
			var _gaq = _gaq || [];
			_gaq.push(['_setAccount', 'UA-2513347-3']);
			_gaq.push(['_setDomainName', '.ele.me']);
			_gaq.push(['_setAllowHash', false]);
			_gaq.push(['_addIgnoredOrganic', '饿了']);
			_gaq.push(['_addIgnoredOrganic', '饿了么']);
			_gaq.push(['_addIgnoredOrganic', '¶öÁËÃ´']);
			_gaq.push(['_addIgnoredOrganic', '饿了吗']);
			_gaq.push(['_addIgnoredOrganic', '¶öÁËÂð']);
			_gaq.push(['_addIgnoredOrganic', '饿了网']);
			_gaq.push(['_addIgnoredOrganic', '饿了吗?']);
			_gaq.push(['_addIgnoredOrganic', '饿了吧']);
			_gaq.push(['_addIgnoredOrganic', '饿了么网']);
			_gaq.push(['_addIgnoredOrganic', '饿了么网上订餐']);
			_gaq.push(['_addIgnoredOrganic', '饿了么 上海']);
			_gaq.push(['_addIgnoredOrganic', '饿了么 杭州']);
			_gaq.push(['_addIgnoredOrganic', '饿了么 北京']);
			_gaq.push(['_addIgnoredOrganic', '饿了么上海']);
			_gaq.push(['_addIgnoredOrganic', '饿了么网站']);
			_gaq.push(['_addIgnoredOrganic', '饿了么杭州']);
			_gaq.push(['_addIgnoredOrganic', '饿了吗网站']);
			_gaq.push(['_addIgnoredOrganic', 'ele']);
			_gaq.push(['_addIgnoredOrganic', 'eleme']);
			_gaq.push(['_addIgnoredOrganic', 'elema']);
			_gaq.push(['_addIgnoredOrganic', 'ele.me']);
			_gaq.push(['_addIgnoredOrganic', 'ele me']);
			_gaq.push(['_addIgnoredOrganic', 'www.ele.me']);
			_gaq.push(['_addIgnoredOrganic', 'http://ele.me/']);
			_gaq.push(['_addIgnoredOrganic', 'http://www.ele.me/']);
			_gaq.push(["_addOrganic", "sogou", "query"]);
			_gaq.push(["_addOrganic", "so.360.cn", "q"]);
			_gaq.push(["_addOrganic", "so.com", "q"]);
			_gaq.push(["_addOrganic", "baidu", "word"]);
			_gaq.push(['_addOrganic', 'm.baidu', 'word']);
			_gaq.push(['_addOrganic', 'wap.baidu', 'word']);
			_gaq.push(['_addOrganic', 'baidu', 'kw']);
			_gaq.push(['_addOrganic', 'baidu', 'wd']);
			_gaq.push(["_addOrganic", "soso", "w"]);
			_gaq.push(['_trackPageview']);
			
			
			
		</script>
		
		<script type="text/javascript">
			var formData = new FormData(); 
			formData.append('file', $('#input_file')[0].files[0]);  //添加图片信息的参数
			formData.append('sizeid',123);  //添加其他参数
			$.ajax({
			    url: '/material/uploadFile',
			    type: 'POST',
			    cache: false, //上传文件不需要缓存
			    data: formData,
			    processData: false, // 告诉jQuery不要去处理发送的数据
			    contentType: false, // 告诉jQuery不要去设置Content-Type请求头
			    success: function (data) {
			        var rs = eval("("+data+")");
			        if(rs.state==1){
			            tipTopShow('上传成功！');
			        }else{
			            tipTopShow(rs.msg);
			        }
			    },
			    error: function (data) {
			        tipTopShow("上传失败");
			    }
			})  
		</script>
		<script type="text/javascript" src="./个人中心 - 订单中心-member_order_files/head_201503262210.js.下载"></script>
	</head>

	<body>
		<div class="full-content-wrapper">
			<header id="menu" role="banner">
				<!-- logo -->
				<div id="logo">
					<img alt="平台Logo" src="./images/logo2.jpg" style="width:250px; height:50px; float:left">
				</div>
				<!-- 首页  -->
				<div class="menu1">
					<span class="font">首页</span>
				</div>
				<!-- 我的订单 -->
				<div class="menu1">
					<span class="font">我的订单</span>
				</div>
				<!-- 个人中心 -->
				<div class="menu1">
					<span class="font">个人中心</span>
				</div>
				<!-- 退出登录 -->
				<div class="menu1">
					<span class="font">退出登录</span>
				</div>
			</header>
			<div class="container">
				<div id="search">
					<span id="addre">当前位置：仲恺农业工程学院</span><a href="#">[修改当前地址]</a>
				</div>
				<div class="wash-paper clearfix" id="profile">
					<nav class="profile-nav">
						<ul class="nav nav-list">
							<li>
								<a href="mine.html"> <i class="icon-user"></i> 个人中心 </a>
							</li>
							<li class="divider"></li>
							<li class="nav-header">我的收藏</li>
							<li>
								<a href="collection.html"> <i class="icon-heart"></i> 我收藏的餐厅 </a>
							</li>
							<li class="divider"></li>
							<li class="nav-header">我的资料</li>
							<li>
								<a href="private.html"> <i class="icon-list"></i> 个人资料 </a>
							</li>
							<li>
								<a href="address.html"> <i class="icon-gift"></i> 地址管理 </a>
							</li>
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
										<label class="control-label" for=""><span class="required">*</span>原密码</label>
										<div class="controls">
											<input name="user[old_password]" id="sf_guard_user_old_pwd" type="password">
											<p class="help-block">(请输入现在正在使用的密码)</p>
										</div>
										<!--end input-->
									</div>
									<!--end clearfix-->
									<div class="control-group">
										<label class="control-label" for=""><span class="required">*</span>新密码</label>
										<div class="controls">
											<input name="user[new_password]" id="sf_guard_user_new_pwd" type="password">
											<p class="help-block">（请输入新密码）</p>
										</div>
										<!--end input-->
									</div>
									<!--end clearfix-->
									<div class="control-group clear-fix">
										<label class="control-label" for=""><span class="required">*</span>重复新密码</label>
										<div class="controls">
											<input name="user[repeat_new_password]" id="sf_guard_user_repeat_pwd" type="password">
											<p class="help-block">(请再输入一次新密码)</p>
										</div>
										<!--end input-->
									</div>
									<!--end clearfix-->
									<div class="form-actions">
										<button type="button" class="btn btn-yellow" id="sf_guard_user_changepwd_submit">提交更改</button>
									</div>
								</fieldset>
							</form>
						</div>
						<div class="content-header">
							<h2>修改头像</h2>
						</div>
						<div class="content-inner profile-changepwd file-box">
						    
						    <!--<input type="text" id="imgfield" class="txt" placeholder="预览"><br /><br /><br />-->
						    <input type="file" name="file" id = "input_file" accept="image/gif,image/jpeg,image/jpg,image/png,image/svg" onchange="imgPreview(this)" >  
							<div id="pic">
						    	<img id="preview" />
						    </div>
							<div id="clear"></div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<script type="text/javascript" src="./个人中心 - 订单中心-member_order_files/foot_201503262210.js.下载"></script>
		<script src="./个人中心 - 订单中心-member_order_files/profile_201503262210.js.下载"></script>
		<script type="text/javascript" src="js/upload.js" ></script>

	</body>

</html>
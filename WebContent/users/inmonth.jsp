<%@ page language="java"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<script type="text/javascript">
		</script>
		<title>订单中心--最近一个月</title>

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
					<a href="inmonth.html"><span class="font">我的订单</span></a>
				</div>
				<!-- 个人中心 -->
				<div class="menu1">
					<a href="mine.html"><span class="font">个人中心</span></a>
				</div>
				<!-- 退出登录 -->
				<div class="menu1">
					<span class="font">欢迎你，xxx</span>
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
							<li class="nav-header">订单中心</li>
							<li class="active">
								<a href="inmonth.html"> <i class="icon-calendar icon-white"></i> 最近一个月 </a>
							</li>
							<li>
								<a href="outmonth.html"> <i class="icon-list-alt"></i> 一个月之前 </a>
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
							<h2> 最近一个月的饿单 - 共1张 </h2>
						</div>
						<div class="content-inner">
							<div class="order-list">
								<span id="ref_time"></span>
								<div class="order-block" data-id="12266119358749105">
									<div class="order-header">
										<!--<div class="status-wrapper">
											<span class="order-mess">订单状态：</span>
											<span class="intro5 order-status">已完成</span>
											<span class="intro5 sendtime">送达时间：2017/11/23 14:24:56</span>
										</div>-->
										<div class="status-wrapper">
											<div class="status gray">
												订单完成@
												<a href="#" target="_blank">康博煲仔饭</a>
											</div>
											<div class="hasten-btn">
											</div>
										</div>
										<div class="line-three">
											<p class="book-tips"> 送达时间：2014-03-11 12:30:00 </p>
										</div>

										<div class="line-two">
											<table class="table table-condensed">
												<tbody>
													<tr>
														<td class="col1"><span class="item-name">订单号:</span> 12266119358749105</td>
														<td class="col2"><span class="item-name">下单时间:</span><span class="om_time" data-time="2015-03-09 23:03:20">2015-03-09 23:03</span></td>
														<td class="col3"><span class="item-name">餐厅电话:</span>15537263070 15537263070</td>
													</tr>
													<tr>
														<td class="col1"><span class="item-name">联系人:</span>吴美玲 </td>
														<td class="col2"><span class="item-name">订单地址:</span> 中山北路1655弄 29支弄宝钢公寓 11号304</td>

														<td><span class="item-name">联系电话:</span>18005151538</td>
													</tr>
													<tr>
														<td class="col3"><span class="item-name">订单备注:</span>加辣不加葱 </td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div class="order-rate">
										<div class="line-one">
											<div class="col-title">
												点评状态：
												<button id="evaluate-status">未点评</button>
											</div>
										</div>
									</div>
									<div class="order-table-wrapper">
										<table class="order-table table table-striped">
											<thead>
												<tr>
													<th class="col-name">美食篮子</th>
													<th class="col-price">单价</th>
													<th class="col-quantity">数量</th>
													<th class="col-sub-total">小计</th>
												</tr>
											</thead>
											<tbody>
												<tr 12266119358749105="">
													<td class="col-name"> <span>原味炒酸奶</span> </td>
													<td class="col-price">￥6</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥6</td>
												</tr>
												<tr 12266119358749105="">
													<td class="col-name"> <span>抹茶炒酸奶</span> </td>
													<td class="col-price">￥10</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥10</td>
												</tr>
												<tr 12266119358749105="">
													<td class="col-name"> <span>巧克力炒酸奶</span> </td>
													<td class="col-price">￥10</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥10</td>
												</tr>
											</tbody>
										</table>
										<table class="order-table total-table table table-striped">
											<tfoot>
												<tr>
													<td class="col-name">合计</td>
													<td class="col-price"></td>
													<td class="col-quantity">3</td>
													<td class="col-sub-total relative">￥26 </td>
												</tr>
											</tfoot>
										</table>
									</div>
								</div>
								<div class="order-block" data-id="12266119358749105">
									<div class="order-header">
										<!--<div class="status-wrapper">
											<span class="order-mess">订单状态：</span>
											<span class="intro5 order-status">已完成</span>
											<span class="intro5 sendtime">送达时间：2017/11/23 14:24:56</span>
										</div>-->
										<div class="status-wrapper">
											<div class="status gray">
												商家未接单@
												<a href="#" target="_blank">康博煲仔饭</a>
											</div>
											<div class="hasten-btn">
												<button>取消订单</button>
											</div>
										</div>
										<div class="line-three">
											<p class="book-tips"> 送达时间：2014-03-11 12:30:00 </p>
										</div>

										<div class="line-two">
											<table class="table table-condensed">
												<tbody>
													<tr>
														<td class="col1"><span class="item-name">订单号:</span> 12266119358749105</td>
														<td class="col2"><span class="item-name">下单时间:</span><span class="om_time" data-time="2015-03-09 23:03:20">2015-03-09 23:03</span></td>
														<td class="col3"><span class="item-name">餐厅电话:</span>15537263070 15537263070</td>
													</tr>
													<tr>
														<td class="col1"><span class="item-name">联系人:</span>吴美玲 </td>
														<td class="col2"><span class="item-name">订单地址:</span> 中山北路1655弄 29支弄宝钢公寓 11号304</td>

														<td><span class="item-name">联系电话:</span>18005151538</td>
													</tr>
													<tr>
														<td class="col3"><span class="item-name">订单备注:</span>加辣不加葱 </td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div class="order-rate">
										<div class="line-one">
											<div class="col-title">
												点评状态：
												<button id="evaluate-status">未点评</button>
											</div>
										</div>
									</div>
									<div class="order-table-wrapper">
										<table class="order-table table table-striped">
											<thead>
												<tr>
													<th class="col-name">美食篮子</th>
													<th class="col-price">单价</th>
													<th class="col-quantity">数量</th>
													<th class="col-sub-total">小计</th>
												</tr>
											</thead>
											<tbody>
												<tr 12266119358749105="">
													<td class="col-name"> <span>原味炒酸奶</span> </td>
													<td class="col-price">￥6</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥6</td>
												</tr>
												<tr 12266119358749105="">
													<td class="col-name"> <span>抹茶炒酸奶</span> </td>
													<td class="col-price">￥10</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥10</td>
												</tr>
												<tr 12266119358749105="">
													<td class="col-name"> <span>巧克力炒酸奶</span> </td>
													<td class="col-price">￥10</td>
													<td class="col-quantity">1</td>
													<td class="col-sub-total">￥10</td>
												</tr>
											</tbody>
										</table>
										<table class="order-table total-table table table-striped">
											<tfoot>
												<tr>
													<td class="col-name">合计</td>
													<td class="col-price"></td>
													<td class="col-quantity">3</td>
													<td class="col-sub-total relative">￥26 </td>
												</tr>
											</tfoot>
										</table>
									</div>
								</div>
							</div>
							<div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<script type="text/javascript" src="./个人中心 - 订单中心-member_order_files/foot_201503262210.js.下载"></script>
		<script src="./个人中心 - 订单中心-member_order_files/profile_201503262210.js.下载"></script>

	</body>

</html>
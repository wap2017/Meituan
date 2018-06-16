<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<title>个人中心</title>


<link href="css/total_css.css" type="text/css" rel="stylesheet">

</head>

<body>
	<div class="full-content-wrapper">
		<header id="menu" role="banner"> <!-- logo -->
		<div id="logo">
			<img alt="平台Logo" src="./images/logo1.png"
				style="width: 250px; height: 50px; float: left">
		</div>
		<!-- 首页  -->
		<div class="menu1" style="width: 250px; height:50px; float: left">
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
					<li class="active"><a href="mine.jsp"> <i
							class="icon-user"></i> 个人中心
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
					<li class="nav-header">我的收藏</li>
					<li><a href="collection.jsp"> <i class="icon-heart"></i>
							我收藏的餐厅
					</a></li>
					<li class="divider"></li>
					<li class="nav-header">我的资料</li>
					<li><a href="private.jsp"> <i class="icon-list"></i> 个人资料
					</a></li>
					<li><a href="address.jsp"> <i class="icon-gift"></i> 地址管理
					</a></li>
				</ul>
				</nav>
				<div class="main-content">
					<div class="content-header">
						<h2>个人中心</h2>
					</div>
					<div class="content-inner profile-index">
						<div class="account-status clearfix">
							<div class="clearfix">
								<div class="col-left">
									<div class="avatar">
										<a href="/profile/set_avatar">上传<br />头像
										</a>
									</div>
									<div class="safety-level-wrapper">
										<h5>账号名称</h5>
									</div>
								</div>
								<div class="col-right">
									<p class="text-gray">账户余额：</p>
									<div class="account-balance clearfix">
										<div class="balance">
											<strong class="">100</strong> 元
										</div>
										<div class="relative">
											<a class="btn btn-yellow" href="payfor.jsp">立刻充值</a>
										</div>
									</div>
								</div>
							</div>
							<ul class="related-info clearfix">
								<li><i class="icon-star"></i>收藏： <a
									href="member_collect_shop.html">25</a>家餐厅</li>
							</ul>
						</div>
						<div class="latest-orders tab_wrapper">
							<ul class="tab_header">
								<li class="active">最近订单</li>
							</ul>
							<div class="tab_body">
								<div class="food-orders">
									<table>
										<thead>
											<tr>
												<th>订单号</th>
												<th>下单时间</th>
												<th>餐厅</th>
												<th>饿单详情</th>
												<th>饿单状态</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td class="sn"><a
													href="/profile/order/filter/single/id/12266119358749105"
													target="_blank">12266119358749105</a></td>
												<td class="time">3-9 23:03</td>
												<td class="restaurant">臻好时酸奶…</td>
												<td>原味炒酸奶1份/抹茶炒酸奶1份/巧克力…</td>
												<td class="status"><span
													class="
                  gray"> 无效订单 </span></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>



</body>
</html>

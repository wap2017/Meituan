<%@ page language="java"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>订单中心--最近一个月</title>

		<link href="css/total_css.css" type="text/css" rel="stylesheet">
		
	</head>

	<body>
		<div class="full-content-wrapper">
			<header id="menu" role="banner">
				<!-- logo -->
				<div id="logo">
					<img alt="平台Logo" src="./images/logo1.png" style="width:250px; height:50px; float:left">
				</div>
				<!-- 首页  -->
				<div class="menu1" style="width:250px; height:50px; float:left">
						<a href="home.jsp"><span class="font">首页</span></a>
					</div>
					<!-- 我的订单 -->
					<div class="menu1" style="width:250px; height:50px; float:left">
						<span class="font"><a href="inmonth.jsp">我的订单</a></span>
					</div>
					<!-- 个人中心 -->
					<div class="menu1" style="width:250px; height:50px; float:left">
						<a href="mine.jsp"><span class="font">个人中心</span></a>
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
							<li>
								<a href="mine.jsp"> <i class="icon-user"></i> 个人中心 </a>
							</li>
							<li class="divider"></li>
							<li class="nav-header">订单中心</li>
							<li class="active">
								<a href="inmonth.jsp"> <i class="icon-calendar icon-white"></i> 最近一个月 </a>
							</li>
							<li>
								<a href="outmonth.jsp"> <i class="icon-list-alt"></i> 一个月之前 </a>
							</li>
							<li class="divider"></li>
							<li class="nav-header">我的收藏</li>
							<li>
								<a href="collection.jsp"> <i class="icon-heart"></i> 我收藏的餐厅 </a>
							</li>
							<li class="divider"></li>
							<li class="nav-header">我的资料</li>
							<li>
								<a href="private.jsp"> <i class="icon-list"></i> 个人资料 </a>
							</li>
							<li>
								<a href="address.jsp"> <i class="icon-gift"></i> 地址管理 </a>
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

	</body>

</html>
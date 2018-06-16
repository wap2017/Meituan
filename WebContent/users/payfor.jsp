<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>

<title>个人中心 --支付页面</title>


<link href="css/total_css.css" type="text/css" rel="stylesheet">
 <script type="text/javascript" src="./js/head_201503262210.js"></script> 
 
 
</head>

<body>
	<div class="full-content-wrapper">
		<header id="menu" role="banner"> <!-- logo -->
		<div id="logo">
			<img alt="平台Logo" src="./images/logo1.png"
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
					<li  class="active"><a
						href="mine.jsp">
							<i class="icon-user"></i> 个人中心
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
					<li><a
						href="collection.jsp">
							<i class="icon-heart"></i> 我收藏的餐厅
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
						<h2>充值详情</h2>
					</div>
					<div class="content-inner">
						<div class="charge-panel clearfix">
							<h5 class="title">选择金额：</h5>
							<div class="charge_value">
								<strong id="charge_value"><input type="text" name=""></strong>
								元
							</div>
						</div>
						<form id="charge_form" name="alipayment"
							action="http://v5.ele.memember_charge" method="post"
							target="_blank">
							<div id="body">
								<input name="total_fee" id="charge_fee" type="hidden"
									value="300" /> <input name="csrf_token" id="csrf_token"
									type="hidden" value="f8fad6e4510afe5fbd48dc5206d213175bf57c1f" />
								<p>第三方支付：</p>
								<div class="common_charge">
									<label><input type="radio" name="pay_bank"
										value="directPay" checked="" /><img src="images/alipay.gif" /></label>
								</div>
								<p>网上银行：</p>
								<ul class="bank-list clearfix">
									<li><label><input type="radio" name="pay_bank"
											value="ICBCB2C" /><span class="icon ICBC"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="CMB" /><span class="icon CMB"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="CCB" /><span class="icon CCB"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="BOCB2C" /><span class="icon BOC"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="ABC" /><span class="icon ABC"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="COMM" /><span class="icon COMM"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="PSBC-DEBIT" /><span class="icon PSBC"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="CEBBANK" /><span class="icon CEB"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="SPDB" /><span class="icon SPDB"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="GDB" /><span class="icon GDB"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="CITIC" /><span class="icon CITIC"></span></label></li>
									<li><label><input type="radio" name="pay_bank"
											value="CIB" /><span class="icon CIB"></span></label></li>
									<li><a class="show-more-banks" id="show_more_banks">+
											显示更多银行</a></li>
								</ul>
							</div>
							<div class="form-actions clearfix">
								<button class="btn btn-yellow" data-toggle="modal"
									href="#charge_box" type="button" id="charge_box_btn">确认付款</button>
							</div>
						</form>
						<div class="modal hide fade" id="charge_box" aria-hidden="true"
							tabindex="-1">
							<div class="modal-header">
								<a class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
								<h3>充值遇到问题？</h3>
							</div>
							<div class="modal-body">
								<p>充值完成前请不要关闭此窗口。完成充值后请根据你的情况点击下面的按钮。</p>
								<h4>请在新开网上储蓄卡页面完成付款后再选择。</h4>
							</div>
							<div class="modal-footer">
								<a class="btn" href="#">充值遇到问题</a> <a
									class="btn btn-yellow" href="mine.jsp">已完成充值</a> <a
									href="payfor.jsp" class="charge-back" id="btn_back"
									style="float: left; margin-top: 10px;">返回重新选择充值方式</a>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

	</div>

<script type="text/javascript" src="./js/foot_201503262210.js"></script>

</body>


</html>

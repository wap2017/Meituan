<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
	<div class="row">
				<div class="span3">
					<div class="well" style="padding: 8px 0;">
						<ul class="nav nav-list">
							<li class="nav-header">
								快速导航
							</li>
							<li >
								<a href="index.jsp"><i class="icon-home"></i>首页</a>
							</li>
							<li>
								<a href="waitingOrder.jsp"><i class="icon-folder-open"></i>待接单</a>
							</li>
							<li>
								<a href="proceedOrder.jsp"><i class="icon-check"></i>进行中的订单</a>
							</li>
							<li>
								<a href="addMerchandise.jsp"><i class="icon-plus"></i> 添加商品</a>
							</li>
							<li class="active">
								<a href="sale.jsp"><i class="icon-white icon-file"></i>销售总览</a>
							</li>
							<li>
								<a href="evaluate.jsp"><i class="icon-envelope"></i>用户评价</a>
							</li>
							<li class="nav-header">
								账户管理
							</li>
							<li>
								<a href="account.jsp"><i class="icon-user"></i> 账户信息</a>
							</li>
							<li>
								<a href="settings.jsp"><i class="icon-cog"></i> 设置</a>
							</li>
							<li class="divider">
							</li>
						</ul>
					</div>
				</div>
		<!-- -------------一样的地方-------------------- -->
				<div class="span9">
					<h3>订单销售总览</h3>
					<div class="sell">
						<div class="sellsum">
							<div class="left"> 
								<span class="count">32897</span><br/>
								<span>订单数</span>
							</div>
							<div class="right"> 
								<span class="count">￥32897</span><br/>
								<span>营业额</span>
							</div>
						</div>
						<div class="sellsearch">
							从<input type="date" name="dateleft">到<input type="date" name="dateright">
							<input type="button" value="查询">
						</div>
						<h4>2018/6/15</h4>
						<div>
							<div>
							<img alt="" src="">
							<span>鸡蛋炒河粉</span>
							</div>
						</div>
					</div>
					
						
						
						
						
						
						
						</div>
					</div>
				
		
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/site.js"></script>
</body>
</html>
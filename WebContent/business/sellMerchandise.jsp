<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
							<li  class="active">
								<a href="addMerchandise.jsp"><i class="icon-white icon-plus"></i> 添加商品</a>
							</li>
							<li>
								<a href="sale.jsp"><i class="icon-file"></i>销售总览</a>
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
					<div class="well summary">
					<ul>
							<li>
								<a href="addMerchandise.jsp">添加商品</a>
							</li>
							<li  class="active">
								<span>正在销售的商品</span>
							</li>
							<li>
								<a href="Merchandise.jsp">仓库中的商品</a>
							</li>
						</ul>
					</div>
					<h2>
						销售中的商品
					</h2>
					<div class="Search">
					search:<input type="text" id="search">
					</div>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									商品图片
								</th>
								<th>
									商品名
								</th>
								<th>
									月销量
								</th>
								<th>
									好评率
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									Nike.com Redesign
								</td>
								<td>
									Monsters Inc
								</td>
								<td>
									New Task
								</td>
								<td>
									4 days ago
								</td>
								<td>
									<a href="#" class="view-link">修改属性</a>
									<a href="#" class="view-link">下架</a>
								</td>
							</tr>
							
						</tbody>
					</table>
						
						
						
						
						
						
						</div>
					</div>
				
		
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/site.js"></script>
</body>
</html>
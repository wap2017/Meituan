<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<meta charset="utf-8">
		<title>快点慢吃商家中心</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	</head>
	<script type="text/javascript">
	function exit(){
		var con=confirm("确认退出？"); 
		if(con==true)
			window.location.href="../business/quit.action";
	}
	</script>
	<body>
		<div class="container">
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#">商家端</a>
						<div class="nav-collapse">
							<ul class="nav">
								<li>
									<a href="index.jsp">首页</a>
								</li>
								
								<li class="dropdown">
									<a href="" class="dropdown-toggle" data-toggle="dropdown">订单管理 <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li>
											<a href="waitingOrder.jsp">待接单</a>
										</li>
										<li>
											<a href="proceedOrder.jsp">进行中的订单</a>
										</li>
										<li>
											<a href="cancelOrder.jsp">已取消的订单</a>
										</li>
										<li>
											<a href="completeOrder.jsp">已完成的订单</a>
										</li>
									</ul>
								</li>
								<li class="dropdown">
									<a href="" class="dropdown-toggle" data-toggle="dropdown">商品管理 <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li>
											<a href="addMerchandise.jsp">添加商品</a>
										</li>
										<li>
											<a href="sellMerchandise.jsp">正在销售的商品</a>
										</li>
										<li>
											<a href="Merchandise.jsp">仓库中的商品</a>
										</li>
									</ul>
								</li>
							</ul>
						<ul class="nav pull-right">
								<li>
									<a href="account.jsp">账号管理</a>
								</li>
								<li>
									<input type="button" id="layout" value="退出" onclick="exit()">
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			
</body>
</html>
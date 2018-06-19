<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<meta charset="utf-8">
		<title>快点慢吃商家端</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
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
							<li class="active">
								<a href="index.jsp"><i class="icon-white icon-home"></i>首页</a>
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
							<!-- 暂时没有用 -->
							<li>
								<a href="help.htm"><i class="icon-info-sign"></i> Help</a>
							</li>
<!-- 							<li class="nav-header"> -->
<!-- 								Bonus Templates -->
<!-- 							</li> -->
<!-- 							<li> -->
<!-- 								<a href="gallery.htm"><i class="icon-picture"></i> Gallery</a> -->
<!-- 							</li> -->
<!-- 							<li> -->
<!-- 								<a href="blank.htm"><i class="icon-stop"></i> Blank Slate</a> -->
<!-- 							</li> -->
						</ul>
					</div>
				</div>
				<div class="span9">
					<div class="well summary">
						<ul class="orderCount">
							
							<li>
								<span>今日订单数<span class="count">27</span></span>
							</li>
							<li>
								<span>总订单数<span class="count">7</span></span>
							</li>
						</ul>
						<ul class="orderMoney">
							<li>
								<span>今日营业额<span class="count">5</span></span>
							</li>
							<li>
								<span>总营业额<span class="count">5</span></span>
							</li>
						</ul>
					</div>
					<h2>
						热销中的商品
					</h2>
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
									管理
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
									<a href="#" class="view-link">View</a>
								</td>
							</tr>
							
						</tbody>
					</table>
				</div>
			</div>
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery-1.9.1.js"></script>
	<script type="text/javascript">
	$(function() {
		find1();
		find2();
	});
	function find1() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/order/findOrdersCount.action?bId=b1",
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){
					if(data[0]==null)data[0]=0;
					if(data[1]==null)data[1]=0;
					$(".orderCount").html("");
					let li_todayOrderNum=$("<li><span>今日订单数<span class='count'>"+data[1]+"</span></span></li>");
					let li_orderNum=$("<li><span>总订单数<span class='count'>"+data[0]+"</span></span></li>");
					$(".orderCount").append(li_todayOrderNum,li_orderNum);
				}
			});
		}
	function find2() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/order/findOrdersMoney.action?bId=b1",
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){
					if(data[0]==null)data[0]=0;
					if(data[1]==null)data[1]=0;
					$(".orderMoney").html("");
					let li_todayOrderMoney=$("<li><span>今日营业额<span class='count'>"+data[1]+"</span></span></li>");
					let li_orderMoney=$("<li><span>营业额<span class='count'>"+data[0]+"</span></span></li>");
					$(".orderMoney").append(li_todayOrderMoney,li_orderMoney);
				}
			});
		}
	</script>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/site.js"></script>
	</body>
</html>
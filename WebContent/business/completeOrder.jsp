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
						</ul>
					</div>
				</div>
			<!----一样的部分---->
				<div class="span9">
					<div class="well summary">
						<ul>
							<li>
								<a href="waitingOrder.jsp">待接单</a>
							</li>
							<li>
								<a href="proceedOrder.jsp">进行中的订单</a>
							</li>
							<li>
								<a href="cancelOrder.jsp">已取消订单</a>
							</li>
							<li class="active">
								<span>已完成订单</span>
							</li>
						</ul>
					</div>
			<!-- ------------订单部分一致的地方------------------- -->
				<hr>
				<div class="order">
<!-- 					订单号  收货人  商品 总价  备注信息  收货地址  下单时间  支付状态  操作 -->
					<div class="orderLeft">
						<span>订单号：123412</span><br>
						<span>商品：</span>	<br>
						<span>总价：123</span><br>
						<span id="remark">备注:</span><br>
					</div>
					<div class="orderRight">
					<span>收货人：先生</span><br>
					<span>收货地址:</span><br>
					<span>下单时间:</span><br>
					<span>支付状态:</span><br>
					</div>
					<input type="button" value="接单" class="take">
				<hr>
				</div>
			</div>
		</div>
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/time.js"></script>
	<script type="text/javascript">
	$(function() {
		find1();
	});
	function find1() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/order/findCompleteOrder.action",
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){
					
					$(".order").html("");
					$(data).each(
						function(){
							let orderLeft=$("<div class='orderLeft'></div>");
							let span_id=$("<span>订单号："+this.orders.oId+"</span><br>");
							let span_a = $("<span>商品：</span><br>");
							let span_name=$("<span></span>");
							$(span_name).append(span_a);
							for (var key in this.goods) { 
								 span_b=$("<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+key+"*"+this.goods[key]+"</span><br>");
								$(span_name).append(span_b);
					         } 
							
							let span_money=$("<span>总价："+this.orders.oOrderprice+"</span><br>");
							let span_remark=$("<span id='remark'>备注:"+this.orders.oRemark+"</span><br>");
							$(orderLeft).append.call($(orderLeft),
									span_id,span_name, span_money,
									span_remark);
							let orderRight=$("<div class='orderRight'></div>");
							let span_oid=$("<span>收货人："+this.address.adName+"</span><br>");
							let span_address=$("<span>收货地址:"+this.address.adProvince+this.address.adCity+this.address.adAddress+"</span><br>");
							let span_time=$("<span>下单时间:"+formatDate(new Date(this.orders.oOpentime))+"</span><br>");
							let span_state=$("<span>联系电话:</span><br>");
							$(orderRight).append.call($(orderRight),
									span_oid,span_address, span_time,
									span_state);
							$(".order").append(orderLeft,orderRight,"<hr>");
						})
				},
				error : function(result) {
					$(".order").html("没有订单");
				}
			});
		}
	</script>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/site.js"></script>
</body>
</html>
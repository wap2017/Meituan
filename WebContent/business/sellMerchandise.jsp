<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/DT_bootstrap.css" rel="stylesheet" media="screen">
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
							<li class="nav-header">
								账户管理
							</li>
							<li>
								<a href="account.jsp"><i class="icon-user"></i> 账户信息</a>
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
					<li><a href="addMerchandise.jsp">添加商品</a></li>
					<li class="active"><span>正在销售的商品</span></li>
					<li><a href="Merchandise.jsp">仓库中的商品</a></li>
				</ul>
			</div>
			<div class="sell">
					<div class="row-fluid">
						<table border="0" class="table table-striped table-bordered" id="example2">
						<thead>
							<tr>
								<th style="text-align:center;vertical-align:middle;"> 商品图片 </th>
								<th> 商品名 </th>
								<th> 商品描述 </th>
								<th> 商品类型 </th>
								<th> 商品单价 </th>
								<th> 商品库存 </th>
								<th> 添加时间 </th>
								<th> 管理 </th>
							</tr>
						</thead>
						<tbody class="tboby">
							<tr>
								<td><img src="" class="otherPho" /></td>
								<td> Monsters Inc </td>
								<td> New Task </td>
								<td> 4 days ago </td>
								<td> 4 days ago </td>
								<td> 4 days ago </td>
								<td> 4 days ago </td>
								<td>
									<input type="button" class="view-link" value="修改" onclick="modify()">
									<input type="button" class="view-link" value="下架" onclick="quit()">
								</td>
							</tr>
						</tbody>
					</table>
					</div>
				</div>
						</div>
					</div>
				
		
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/site.js"></script>
	<script src="js/time.js"></script>
	<script type="text/javascript">
	$(function() {
		find1();
	});
	function find1() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/business/findSellMer.action?i="+1,
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){

					$(".tboby").html("");
					$(data).each(
						function(){
							
							let tr = $("<tr></tr>");
							let td_img = $("<td><img src='goods/"+this.gPicture+"' class='otherP' />");
							let td_name = $("<td>"+this.gName+"</td>");
							let td_detail = $("<td>"+this.gDetail+"</td>");
							let td_type = $("<td>"+this.gType+"</td>");
							let td_price = $("<td>"+this.gPrice+"</td>");
							let td_stock = $("<td>"+this.gStock+"</td>");
							let td_add = $("<td>"+formatDate(new Date(this.gAdd))+"</td>");
							let td_button = $("<td><input type='button' class='view-link' value='下架' gId="+this.gId+" onclick='quit(this)'></td></tr>");
							$(tr).append.call($(tr),td_img,td_name,td_detail,
									td_type,td_price,td_stock,td_add,td_button);
							$(".tboby").append(tr);
						})
				},
						error : function(result) {
							$(".tboby").html("没有商品");
						}
		});
	}
	function quit(th){
		var con=confirm("确认下架该商品？"); 
		if(con==true)
			window.location.href="../order/downGood.action?gId="+th.getAttribute("gId");
	}
	</script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/DT_bootstrap.js"></script>
	<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/putPhoto.js"></script>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<div class="row">
		<div class="span3">
			<div class="well" style="padding: 8px 0;">
				<ul class="nav nav-list">
					<li class="nav-header">快速导航</li>
					<li><a href="index.jsp"><i class="icon-home"></i>首页</a></li>
					<li><a href="waitingOrder.jsp"><i class="icon-folder-open"></i>待接单</a>
					</li>
					<li><a href="proceedOrder.jsp"><i class="icon-check"></i>进行中的订单</a>
					</li>
					<li class="active"><a href="addMerchandise.jsp"><i
							class="icon-white icon-plus"></i> 添加商品</a></li>
					<li><a href="sale.jsp"><i class="icon-file"></i>销售总览</a></li>
					<li><a href="evaluate.jsp"><i class="icon-envelope"></i>用户评价</a>
					</li>
					<li class="nav-header">账户管理</li>
					<li><a href="account.jsp"><i class="icon-user"></i> 账户信息</a></li>
					<li><a href="settings.jsp"><i class="icon-cog"></i> 设置</a></li>
					<li class="divider"></li>
				</ul>
			</div>
		</div>
		<!-- -------------一样的地方-------------------- -->
		<div class="span9">
			<div class="well summary">
				<ul>
					<li class="active"><span>添加商品</span></li>
					<li><a href="sellMerchandise.jsp">正在销售的商品</a></li>
					<li><a href="Merchandise.jsp">仓库中的商品</a></li>
				</ul>
			</div>
			<h3>添加商品</h3>

			<div class="add">
				<form id="uploadAvatar" method="post" enctype="multipart/form-data"
					action="/uploadAvatar">
					<div class="addsinple">
						<div class="left">
							商品名称<br /> <input type="text"><br /> 商品描述<br /> <input
								type="text"><br /> 商品类型<br /> <select>
								<option selected="selected">正餐</option>
								<option>夜宵</option>
								<option>零食</option>
								<option>生鲜</option>
							</select><br /> 商品单价<br /> <input type="text"><br /> 商品库存<br />
							<input type="text"><br />

						</div>
						<div class="right">
							<h5>添加图片</h5>
							<div style="display: none" id="imgDiv">
								<img alt="" src="" id="img" name="图片预览" width="200" height="200"
									id="图片预览">
							</div>
							<input name="imgA" type="file" id="txtSrc" onChange="setImagePreview(this,'txtSrc','imgDiv','img');"><br/>
							<span class="Putaway"><input type="checkbox" id="putaway">是否同时上架销售？</span>
						</div>
						</div>
						<p class="addButton">
							<input type="button" value="继续添加"> 
							<input type="submit" value="确定发布">
						</p>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/site.js"></script>
</body>
</html>
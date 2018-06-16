<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>快点慢吃商家页面详情</title>
<meta name="description" content="地道老四川麻辣烫！">
<link rel="stylesheet" href="./css/total_css.css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script>
	$(function() {
		$("#showshoplist").click(function() {
			$("#showshopevaluate").css("background-color", "#fff");
			$("#showshopevaluate #showfont2").css("color", "#000");
			$("#showshoplist").css("background-color", "#e6e6e6");
			$("#showshoplist #showfont1").css("color", "#5298E6");
			$("#goodevaluate").hide();
			$("#goodslist").toggle();
		});
		$("#showshopevaluate").click(function() {
			$("#goodslist").hide();
			$("#goodevaluate").toggle();
			$("#showshopevaluate").css("background-color", "#e6e6e6");
			$("#showshopevaluate #showfont2").css("color", "#5298E6");
			$("#showshoplist").css("background-color", "#fff");
			$("#showshoplist #showfont1").css("color", "#000");
		});
		
		$("#coll").click(function(){
			$(this).toggleClass("click");
		});
	});
</script>
</head>
<body>
	<!--菜单部分-->
	<div id="menu">
		<!-- logo -->
		<div id="logo">
			<img alt="平台Logo" src="./images/logo1.png"
				style="width: 250px; height: 50px; float: left">
			<div class="clear"></div>

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
			<a href="mine.jsp"><span class="font">个人中心</span></a>
		</div>
		<!-- 退出登录 -->
		<div class="menu1">
			<a href="login.jsp"><span class="font">退出登录</span></a>
		</div>
		<div class="clear"></div>
	</div>
	<!--总体框架-->
	<div id="shopframe">
		<!--商店介绍部分-->
		<div id="head">
			<div id="cover">
				<div class="shoplogo">
					<img src="images/商店logo.png" />
				</div>
				<div class="shopintro">
					<span class="intro1">
						<!--<font color="#FFFFFF">-->潮人便当（江南西店）<!--</font>-->
					</span><br />
					<br />
					
				</div>
				<!--配送费-->
				<div class="shopintro1">
					<span class="intro2">配送费<br />
					<br />&nbsp;&nbsp;￥2
					</span>
				</div>
				<!--平均送达时间-->
				<div class="shopintro1">
					<span class="intro2">平均送达时间<br />
					<br />&nbsp;43分钟送达
					</span>
				</div>
				<!--收藏-->
				<div class="shopintro1">
					<div id="rst_fav" class="rst-block rst-fav">
						<span class="intro2" data-faved="已收藏" data-unfaved="收藏 餐厅">收藏
							餐厅</span> <i class="glyph"><span id="coll">♥</span></i>
					</div>
				</div>
				<div id="clear"></div>
			</div>

		</div>
		<!--商品搜索栏部分-->
		<div id="goodssearch">
			<!--显示商品部分-->
			<div id="showshoplist">
				<span class="intro3" id="showfont1">所有商品</span>
			</div>
			<!--显示评价部分-->
			<div id="showshopevaluate">
				<span class="intro3" id="showfont2">评价</span>
			</div>
			<!--搜索栏-->
			<div id="goodsearch">
				<img alt="搜索框图片" src="./images/glass.jpg" id="searchpic"> <input
					type="text" name="shopName" placeholder="查找商家" id="searchinput" />
			</div>
			<div class="clear"></div>
		</div>
		<!--商店的主要内容部分-->
		<div id="shopcontent">
			<!--商品部分-->
			<div id="goodslist">
				<!--商品logo-->
				<div class="good">
					<div class="goodlogo">
						<img src="images/54d171816ae92ed8d1a82a1dc4428jpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/043f5594a9da62832657133c62968jpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/67f904eb2844a08c29fe31aa0da6ajpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/8aac7903d9a84fd3435ad170a986ejpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/8d4cb484abdb5f1208d73eb4a51cajpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/bdd31e545a67a8501b9922487709ejpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/cc2d8357694402b63ef85fb51a08cjpeg (1).jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="good">
					<div class="goodlogo">
						<img src="images/e8d1756bdd6eb16e5c5337ab3db60jpeg.jpeg" />
					</div>
					<!--商品介绍-->
					<div class="goodintro">
						<span class="intro4">套餐 港记蒜香鸡扒肉酱意粉+柠檬茶</span> <span class="intro5">月售19份</span>

					</div>
					<div class="goodprice">
						<span class="intro6">￥15</span>
					</div>
					<!--购物车部分-->
					<div class="addshopcart">
						<button class="shop-cartbutton ng-binding ng-scope"
							ng-if="!cartItem.quantity &amp;&amp; menuFood.stock"
							ng-click="cartItem.add($event)">加入购物车</button>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<hr />
			<!--评价部分-->
			<div id="goodevaluate">
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
				<div class="evaluate">
					<!--用户信息-->
					<div class="userpic">
						<img src="images/登录页面插图1.jpg" />
					</div>
					<!--评价正文-->
					<div class="evaluatecontent">
						<!--用户账号-->
						<span class="intro3" id="username">傻猫咪1</span>
						<!--评价-->
						<p class="intro7" id="evaluate">
							&nbsp;&nbsp;这家的东西很好吃，让人想要再吃一次，但是送餐时间稍微有点慢，另外，要是多下辣椒就更好吃了，祝卖家生意兴隆！！！
						</p>
					</div>
					<!--评价时间-->
					<div class="evaluatetime">2018/04/05 11:12:24</div>
					<div class="clear"></div>
				</div>
				<hr />
			</div>
			<div class="clear"></div>
		</div>
	</div>

</body>

</html>

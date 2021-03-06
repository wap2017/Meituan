<%@ page language="java" import="com.meituan.pojo.User"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>快点慢吃主页</title>
<link href="./css/index_css.css" rel="stylesheet" style="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script>
			
		$(function(){
				
			if (<%=session.getAttribute("user")%>==null) {//str为null，则false
				$("#loginin .font1").css("display","block");
			} 
	
			/*显示购物车页面*/
			$("#shopcart").click(function() {
				$("#messagepage").hide();
				$("#shopcartpage").toggle();
			});
			$(".back").click(function() {
				$("#shopcartpage").hide();
				$("#messagepage").hide();
			});
			/*显示信息页面*/
			$("#message").click(function() {
				$("#shopcartpage").hide();
				$("#messagepage").toggle();
			});
			
			$("#searchpic").click(function(){
				
				var bShopName = $.trim($('input[name=bShopName]').val());
				alert(bShopName);
				var data = {"bShopName":bShopName};
				$.ajax({
	                type : 'post',
	                url : "../user/searchshop.action",
					data:JSON.stringify(data),
                    contentType:'application/json;charset=UTF-8',
	                success : function(msg) {
	                	if('success'==msg){
                        	alert("传参成功");
                        }else {
                        	alert(msg);            
                        }
	                }
	            });
			});
			

		});
</script>


</head>
<body>
	<!-- 整体主框架 -->
	<div id="frame">
		<div id="left">
			<!-- 菜单栏部分  -->
			<div id="menu">
				<!-- logo -->
				<div id="logo">
					<img alt="平台Logo" src="./images/logo1.png"
						style="width: 250px; height: 100px; float: left">
				</div>
				<!-- 首页  -->
				<div class="menu1" style="width: 250px; height: 100px; float: left">
					<span class="font"><a href="home.jsp">首页</a></span>
				</div>
				<!-- 我的订单 -->
				<div class="menu1" style="width: 250px; height: 100px; float: left">
					<a href="inmonth.jsp"><span class="font">我的订单</span></a>
				</div>
				<!-- 个人中心 -->
				<div class="menu1" style="width: 250px; height: 100px; float: left">
					<a href="mine.jsp"><span class="font" >个人中心</span></a>
				</div>
				<!-- 欢迎 -->
				<div class="menu1" style="width: 250px; height: 100px; float: left">
					
						<div id="loginin">
						<a href="login.jsp">
							<span class="font1" > 登录/注册 </span></a>
						</div>
					
					<div id="user" >
						<span class="font">你好，${user.uNickname}</span>
					</div>

				</div>
				<!--<div class="clear" style="clear:both;"></div>-->
			</div>
			<!-- 搜索部分 -->
			<div id="search">
				<span id="addre">当前位置：仲恺农业工程学院</span>
				<a href="#">[修改当前地址]</a> 
				<img alt="搜索框图片" src="./images/glass.jpg" id="searchpic" > 
				<input type="text" name="bShopName" placeholder="查找商家" id="searchinput" />
			</div>
			<!-- 快捷搜索:看商家是否有分类 -->
			<!--<div id="shortcut"></div>-->
			<!-- 商家列表 -->
			<div id="shoplist">
				<div class="shop">
					<a href="shop.jsp" style="width: 100%; color: #000"> <!-- 商家logo -->
						<div class="shoplogo">

							<img alt="商店logo" src="./images/商店logo.png" width="150px"
								height="150px">
						</div> <!-- 商家说明  -->
						<div class="shopintro">
							<span class="intro1">港堡汉堡</span><br />
							<br /> <span>配送费￥2</span><br />
							<br /> <span>43分钟送达</span>

						</div>
					</a>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo.png" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo.png" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo1.jpg" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo2.jpg" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo3.png" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo4.png" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div class="shop">
					<!-- 商家logo -->
					<div class="shoplogo">
						<img alt="商店logo" src="./images/商店logo.png" width="150px"
							height="150px">
					</div>
					<!-- 商家说明  -->
					<div class="shopintro">
						<span class="intro1">港堡汉堡</span><br />
						<br /> <span class="intro2">配送费￥2</span><br />
						<br /> <span class="intro3">43分钟送达</span>
					</div>
				</div>
				<div id="seeMore">
					<div
						style="font-size: 20px; width: 100%; height: 100%; text-align: center; margin-top: 15px">点击查看更多</div>
				</div>
				<!--<div class="clear" style="clear:both;"></div>-->
			</div>
		</div>
		<div id="right">
			<!-- 购物车 -->
			<div id="shopcart">
				<img src="images/购物车.png" />
			</div>
			<!-- 分割线  -->
			<div id="line"></div>
			<!-- 消息 -->
			<div id="message">
				<img src="images/消息.png" />
			</div>
		</div>
		<!--<div class="clear" style="clear:both;"></div>-->
	</div>
	<div id="shopcartpage">
		<div class="pagename"
			style="padding-top: 4px; background-color: #FFFFFF; height: 30px;">
			<div style="float: left; margin-left: 5px;">购物车</div>
			<div class="back" style="float: right;">&gt;&gt;</div>
			<!--<div class="clear" style="clear:both;"></div>-->
		</div>
		<h3></h3>
		<div class="content"
			style="height: auto; background-color: #FFFFFF; border: 1px solid #85E6C7;">
			<div class="shopcartnumber"
				style="font-size: 12px; margin-left: 5px; float: left;">1号购物车</div>
			<div style="font-size: 12px; float: right">清空</div>
			<h5
				style="background-color: #E6E6E6; margin-left: 5px; margin-right: 5px;"></h5>
			<div class="shopcartcontent">
				<div class="shopname"
					style="width: 38%; float: left; height: 30px; background-color: #FFFFFF; padding-left: 5px;">炸鸡</div>

				<div class="shopnum"
					style="width: 40%; float: left; background-color: #FFFFFF; height: 30px;">
					<span
						style="width: 20px; height: 20px; border: 1px solid #E6E6E6; display: block; float: left; text-align: center;">-</span>
					<span style="float: left;">2</span> <span
						style="width: 20px; height: 20px; border: 1px solid #E6E6E6; display: block; float: left; text-align: center;">+</span>
				</div>

				<div class="shopprice"
					style="width: 20%; height: 30px; float: left; background-color: #FFFFFF;">13</div>
				<!--<div class="clear" style="clear:both;"></div>-->
			</div>
			<!--<div class="clear" style="clear:both;"></div>-->
		</div>
		<div id="countblock"
			style="height: 100px; width: 300px; background-color: #FFFFFF; position: fixed; bottom: 0px;">
			<span style="right: 5px; float: right; display: block;">共2份，总计13</span>
			<input type="button"
				style="width: 200px; height: 35px; background-color: #F95F5F; float: left; margin-top: 10px; margin-left: 50px;"
				value="结算" />
			<!--<div id="clear" style="clear:both;"></div>-->
		</div>
		<!--<div class="clear" style="clear:both;"></div>-->
	</div>
	<div id="messagepage">
		<div class="pagename"
			style="padding-top: 4px; background-color: #FFFFFF; height: 30px;">
			<div style="float: left; margin-left: 5px;">我的消息</div>
			<div class="back" style="float: right;">&gt;&gt;</div>
			<!--<div class="clear" style="clear:both;"></div>-->
		</div>
		<h3></h3>
		<div class="content"
			style="height: auto; background-color: #FFFFFF; border: 1px solid #85E6C7;">
			<div class="fromwho" style="font-size: 12px; margin-left: 5px;">官方小客服</div>
			<hr
				style="background-color: #E6E6E6; margin-left: 5px; margin-right: 5px;" />
			<div class="messagecontent" style="margin-left: 5px;">
				欢迎加入快点慢吃，官方客服祝您用餐愉快！！！</div>
		</div>
		<!--<div class="clear"></div>-->
	</div>

	<script type="text/javascript">
		/* function click1(){
			alert('点击了');
			$.ajax({
                type : 'post',
                url : "../user/searchshop.action",
                contentType:'application/json;charset=UTF-8',
                data:JSON.stringify($.trim($('input[name=bShopName]').val())),
                success : function(msg) {
                    alert(msg);
                }
            });
		}; */

		
	</script>

</body>
</html>

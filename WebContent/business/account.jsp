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
					<li class="nav-header">
						账户管理
					</li>
					<li  class="active">
						<a href="account.jsp"><i class="icon-white icon-user"></i> 账户信息</a>
					</li>
					<li class="divider">
					</li>
				</ul>
			</div>
		</div>
			<!----一样的部分---->
		<div class="span9">
		<div class="modify">
			<input type="button" value="修改信息" id="modifyButton" onclick="ShowDIV('modifyDiv1')">
		</div>
		<div class="well">
		<div class="businessInfos">
		<div class="title">
			<img src="" class="logoPho" />
			<span class="name">店铺名</span><br>
		</div>
			<div class="businessInfo">
				<span>账户：</span><br>
				<span>店铺名：</span><br>
				<span>店铺号码</span><br>
				<span>负责人：</span><br>
				<span>负责人号码：</span><br>
				<span>配送费：</span><br>
				<span>店铺所在地址</span><br>
				<span>申请时间：</span><br>
				<span>营业时间：<br></span><br>
				<span>卫生许可证：<br><img src="" class="otherPho" /></span><br><br>
				<span>营业执照：<br><img src="" class="otherPho" /></span><br>
				<span>身份证照：<br><img src="" class="otherPho" /><br>
							<img src="" class="otherPho" />
				</span>
			</div>
		</div>
		</div>
		</div>
	</div>
		<div class="modifyDiv1">
		<form method="post" enctype="multipart/form-data" action="../business/modify.action">
		<div class="modifyDiv">
		<div class="modiBody">
			<div class="left">
			<span>账户：<span>123</span></span><br>
			<span>商家名：<input type="text" name="bShopname"></span><br>
			<span>配送费:<input type="text" name="bCommission">元</span><br>
			<span>店铺号码:<input type="text" name="sTelephone"></span><br>
			<span>店铺负责人:<input type="text" name="sResponsible"></span><br>
			<span>店铺公告:<textarea cols="30" rows="2" name="bNotice"></textarea></span><br>
			</div>
			<div class="right">
			<span>负责人号码:<input type="text" name="sRphone"></span><br>
			<span>所在省:<input type="text" name="sProvince"></span><br>
			<span>所在市:<input type="text" name="sCity"></span><br>
			<span>详细地址:<input type="text" name="sAddress"></span><br>
			<span>营业时间:从<input type="time" name="sHoursa"></span><br>
			<span>营业时间:到<input type="time" name="sHoursb"></span><br>
			</div>
			</div>
			<div class="modifyButton">
				<input type="submit" value="确认修改" id="modifySure">
				<input type="button" value="取消修改" id="modifyCanel" onclick="canelModify('modifyDiv1')">
			</div>
		</div>
		</form>
		</div>
	<jsp:include page="bottom.jsp"></jsp:include>
	<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/time.js"></script>
	<script type="text/javascript">
	function canelModify(thisObj){
		var con=confirm("是否取消修改"); 
		if(con==true)
		$("." + thisObj).css("display", "none");
	
	}
	function ShowDIV(thisObj) {
		var yscroll = document.documentElement.scrollTop;
		$("." + thisObj).css("top", "100px");
		$("." + thisObj).css({ display: "block", height: $(document).height() });
		document.documentElement.scrollTop = 0;
		find2();
		}

	$(function() {
		find1();
	});
	function find1() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/business/printInfo.action",
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){
					$(".businessInfos").html("");
					let title = $("<div class='title'></div>");
					let img_logo = $("<img src='logo/"+data.bShoplogo+"' class='logoPho' />");
					let span_name = $("<span class='name'>"+data.bShopname+"</span><br>");
					let div = $("<div class='businessInfo'></div>");
					let span_account = $("<span>账户："+data.bId+"</span><br>");
					let span_phone = $("<span>店铺号码："+data.sTelephone+"</span><br>");
					let span_responsible = $("<span>负责人："+data.sResponsible+"</span><br>");
					let span_rPhone = $("<span>负责人号码："+data.sRphone+"</span><br>");
					let span_bCommission = $("<span>配送费："+data.bCommission+"元</span><br>");
					let notice = $("<span>店铺公告:"+data.bNotice+"</span><br>");
					let span_address = $("<span>店铺所在地址:"+data.sProvince+data.sCity+data.sAddress+"</span><br>");
					let span_apply = $("<span>申请时间："+formatDate(new Date(data.sApply))+"</span><br>");
					let span_hours = $("<span>营业时间："+data.sHours+"</span><br>");
					let span_hygiene = $("<span>卫生许可证：<br><img src='hygiene/"+data.sHygiene+"' class='otherPho' /></span><br>");
					let span_license = $("<span>营业执照：<br><img src='license/"+data.sLicense+"' class='otherPho' /></span><br>");
					let span_card = $("<span>身份证照：<br><img src='pos/"+data.sIdcardpos+"' class='otherPho' />"+
							"<img src='back/"+data.sIdcardback+"' class='otherPho' />"+
							"</span>");
					$(title).append.call($(title),img_logo,span_name);
					$(div).append.call($(div),
							span_account,span_phone, span_responsible,span_rPhone,
							span_bCommission,notice,span_address,span_apply,span_hours,span_hygiene,
							span_license,span_card);
					$(".businessInfos").append(title,div);
				}
		});
	}
	function find2() {
		$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/business/printInfo.action",
				async: false,
				contentType:"application/json;charset=utf-8",
				data:{},
				success:function(data){
					
					$(".modiBody").html("");
					let modifyDiv = $("<div class='modifyDiv'></div>");
					let left = $("<div class='left'></div>");
					let account = $("<span>账户：<span>"+data.bId+"</span></span><br>");
					let shopname = $("<span>商家名：<input type='text' name='bShopname' value='"+data.bShopname+"'></span><br>");
					let commission = $("<span>配送费:<input type='text' name='bCommission' value='"+data.bCommission+"'>元</span><br>");
					let sTelephone = $("<span>店铺号码:<input type='text' name='sTelephone' value='"+data.sTelephone+"'></span><br>");
					let resp = $("<span>店铺负责人:<input type='text' name='sResponsible' value='"+data.sResponsible+"'></span><br>");
					let notice = $("<span>店铺公告:<textarea cols='30' rows='2' name='bNotice'>"+data.bNotice+"</textarea></span><br>");
					let right = $("<div class='right'></div>");
					let phone = $("<span>负责人号码:<input type='text' name='sRphone' value='"+data.sRphone+"'></span><br>");
					let pro = $("<span>所在省:<input type='text' name='sProvince' value='"+data.sProvince+"'></span><br>");
					let city = $("<span>所在市:<input type='text' name='sCity' value='"+data.sCity+"'></span><br>");
					let address = $("<span>详细地址:<input type='text' name='sAddress' value='"+data.sAddress+"'></span><br>");
					let time = $("<span>营业时间:从<input type='time' name='sHoursa'></span><br>"+
							"<span>营业时间:到<input type='time' name='sHoursb'></span><br>");
					
					$(left).append.call($(left),account,shopname,commission,sTelephone,resp,notice);
					$(right).append.call($(right),phone,pro,city,address,time);
					$(".modiBody").append(left,right);
				}
		});
	}
	</script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
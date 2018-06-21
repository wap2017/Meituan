<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快点慢吃商家端</title>
<link href="css/register.css" rel="stylesheet">
<script type="text/javascript">
function f(){
		var msg = "<%=request.getAttribute("msg")%>";
	var result=<%=request.getAttribute("msg") == null%>;
	if(!result){
		alert(msg);
		if(msg=="信息添加完成")
			location.href="index.jsp";
	}
}
	f();
</script>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="../business/perfectInfo.action">
		<div class="perfect">
		<div class="title">
			<h2>请完善你的店铺的信息</h2>
		</div>
		<div class="perfectbody">
		<div class="left">
			<span>账户：<span>123</span></span><br>
			<span>商家名：<span>2dfd</span></span><br>
			<span>配送费:<input type="text" name="bCommission">元</span><br>
			<span>店铺号码:<input type="text" name="sTelephone"></span><br>
			<span>店铺负责人:<input type="text" name="sResponsible"></span><br>
			<span>店铺公告:<textarea cols="30" rows="2" name="bNotice"></textarea></span><br>
		</div>
		<div class="right">
			<span>负责人号码:<input type="text" name="sRPhone"></span><br>
			<span>所在省:<input type="text" name="sProvince"></span><br>
			<span>所在市:<input type="text" name="sCity"></span><br>
			<span>详细地址:<input type="text" name="sAddress"></span><br>
			<span>营业时间:从<input type="time" name="sHoursa"></span><br>
			<span>营业时间:到<input type="time" name="sHoursb"></span><br>
		</div>
		</div>
		<input type="submit" value="提交信息" class="infoSubmit"><br>
		<input type="button" value="取消" class="infoCanel">
		</div>
	</form>
</body>
	<script src="js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
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
					$(".perfectbody").html("");
					let div_left = $("<div class='left'></div>");
					let span_id = $("<span>账户：<span>"+data.bId+"</span></span><br>");
					let span_name = $("<span>商家名：<span>"+data.bShopname+"</span></span><br>");
					let span_commiss = $("<span>配送费:<input type='text' name='bCommission' value='"+data.bCommission+"'>元</span><br>");
					let span_telephone = $("<span>店铺手机号码:<input type='text' name='sTelephone'></span><br>");
					let span_resp = $("<span>店铺负责人:<input type='text' name='sResponsible'></span><br>");
					let span_notice = $("<span>店铺公告:<textarea cols='30' rows='2' name='bNotice'></textarea></span><br>");
					let span_phone = $("<span>负责人号码:<input type='text' name='sRPhone' value='"+data.sRphone+"'></span><br>");
					let span_pro = $("<span>所在省:<input type='text' name='sProvince' value='"+data.sProvince+"'></span><br>");
					let span_city = $("<span>所在市:<input type='text' name='sCity' value='"+data.sCity+"'></span><br>");
					let span_add= $("<span>详细地址:<input type='text' name='sAddress' value='"+data.sAddress+"'></span><br>");
					let span_time1 = $("<span>营业时间:从<input type='time' name='sHoursa'></span><br>");
					let span_time2 = $("<span>营业时间:到<input type='time' name='sHoursb'></span><br>");
					let div_right = $("<div class='right'></div>");
					$(div_left).append.call($(div_left),span_id,span_name,
							span_commiss,span_telephone,span_resp,span_notice);
					$(div_right).append.call($(div_right),span_phone,span_pro,
							span_city,span_add,span_time1,span_time2);
					$(".perfectbody").append(div_left,div_right);
				}
		});
	}
	</script>
</html>
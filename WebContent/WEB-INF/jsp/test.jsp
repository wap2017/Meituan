<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
	list主页 ${pi }
	<table class="table table-bordered table-striped">
		<thead>
			<tr>
				<th>用户ID</th>
				<th>用户头像</th>
				<th>昵称</th>
				<th>性别</th>
				<th>学校</th>
				<th>是否禁止</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<input id="select" type="button" value="查询" />
	<script src="<%=basePath%>js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#select").click(function() {
				//alert($("#uId").val());
				$.ajax({
					url : "user/find.action",
					type : "GET",
					//dataType : "json",
					contentType : "application/json;charset=UTF-8",
					//data : {"uId":$("#uId").val() },
					/*data:JSON.stringify({
						uId : $("#uId").val(),
					}),*/
					success: function(data) {
						  $( data.rows ).each(function(){

						    let tr = $("<tr></tr>");
						    let td_uId = $("<td>"+this.uId+"</td>");
						    let td_uPicture = $("<td>"+this.uPicture+"</td>");
						    let td_uNickname = $("<td>"+this.uNickname+"</td>");
						    let td_uSex = $("<td>"+this.uSex+"</td>");
						    let td_uSchool = $("<td>"+this.uSchool+"</td>");
						    let td_uIsban = $("<td>"+this.uIsban+"</td>");

						    $( tr ).append.call( $(tr), td_uId, td_uPicture, td_uNickname, td_uSex, td_uSchool,td_uIsban );

						    $( "table" ).append( tr );
						  })

						},
					error : function(result) {
						$("#select-box").html("查询失败");
					}
				});
			});
		});
	</script>
</body>
</html>



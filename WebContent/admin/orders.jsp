<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<base href="/Meituan/admin/" />
<meta charset="UTF-8">
<title>订单管理</title>
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet"
	media="screen">
<link href="assets/styles.css" rel="stylesheet" media="screen">
<link href="assets/DT_bootstrap.css" rel="stylesheet" media="screen">
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="vendors/flot/excanvas.min.js"></script><![endif]-->
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>

<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">美团后台管理系统</a>
				<div class="nav-collapse collapse">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" role="button"
							class="dropdown-toggle" data-toggle="dropdown"> <i
								class="icon-user"></i>${username}<i class="caret"></i>

						</a>
							<ul class="dropdown-menu">
								<li><a tabindex="-1" href="login.jsp">注销</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3" id="sidebar">
				<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					<li  class="active"><a href="orders.jsp"><i class="icon-chevron-right"></i>
							订单管理</a></li>
					<li><a href="users.jsp"><i class="icon-chevron-right"></i>用户管理</a></li>
					<li><a href="business.jsp"><i class="icon-chevron-right"></i>商家管理</a></li>
					<li><a href="identification.jsp"><i class="icon-chevron-right"></i>认证管理</a>
					</li>
					<li><a href="history.jsp"><i class="icon-chevron-right"></i>认证记录</a>
					</li>
				</ul>
			</div>
			<!--/span-->
			<div class="span9" id="content">



				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">订单管理</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<div class="table-toolbar">
								</div>

								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example2">
									<thead>
										<tr>
										    <th style="text-align:center;vertical-align:middle;">澶村儚</th>		
										    <th style="text-align:center;vertical-align:middle;">鐢ㄦ埛id</th>									
											<th style="text-align:center;vertical-align:middle;">鏄电О</th>
											<th style="text-align:center;vertical-align:middle;">鍓╀綑閲戦</th>
											<th style="text-align:center;vertical-align:middle;">鎿嶄綔</th>
										</tr>
									</thead>
									<tbody>
										<tr class="gradeA">
											<td style="text-align:center;vertical-align:middle;">
											<img src="../users/default.jpg" height="80dp" width="80dp"  style="border-radius: 50px;" />
											</td>
											<td  style="text-align:center;vertical-align:middle;">user_00001</td>
											<td  style="text-align:center;vertical-align:middle;">Webkit</td>
											<td  style="text-align:center;vertical-align:middle;">312.8</td>
											<td  style="text-align:center;vertical-align:middle;"><a>淇敼</a>&nbsp&nbsp&nbsp<a>鍒犻櫎</a></td>
											
										</tr>
										<tr class="gradeA">
											<td>Webkit</td>
											<td>Safari 2.0</td>
											<td>OSX.4+</td>
											<td class="center">419.3</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Webkit</td>
											<td>Safari 3.0</td>
											<td>OSX.4+</td>
											<td class="center">522.1</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Webkit</td>
											<td>OmniWeb 5.5</td>
											<td>OSX.4+</td>
											<td class="center">420</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Webkit</td>
											<td>S60</td>
											<td>S60</td>
											<td class="center">413</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 7.0</td>
											<td>Win 95+ / OSX.1+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 7.5</td>
											<td>Win 95+ / OSX.2+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 8.0</td>
											<td>Win 95+ / OSX.2+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 8.5</td>
											<td>Win 95+ / OSX.2+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 9.0</td>
											<td>Win 95+ / OSX.3+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
										<tr class="gradeA">
											<td>Presto</td>
											<td>Opera 8.5</td>
											<td>Win 95+ / OSX.2+</td>
											<td class="center">-</td>
											<td class="center">A</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /block -->
				</div>
			</div>
		</div>
		<hr>
				<footer>
			<p>
				&copy;开发者:李旭锐&nbsp陈妙纯&nbsp周佩蓉&nbsp<a
					href="https://github.com/wap2017/Meituan.git" target="_blank" title="访问博客">github入口</a>
		</footer>
	</div>
	<!--/.fluid-container-->


    <script type="text/javascript">
      function addUser()
      {
    	 
    	  document.getElementById('myForm').submit();
    	 
      }
      
      
      
    </script>
	<script src="vendors/jquery-1.9.1.js"></script>
	<script type="text/javascript">
  	$(function() {
			find();
		});
		function find() {
			$.ajax({
						url : "../order/findAll.action",
						type : "GET",
						async: false,   
						contentType : "application/json;charset=UTF-8",
						data : {},
						success : function(data) {
						
							$("#example2")
									.html("<table cellpadding='0' cellspacing='0' border='0' class='table table-striped table-bordered' id='example2'><thead><tr>"
								+"<th style='text-align:center;vertical-align:middle;'>订单号</th>"
								+"<th style='text-align:center;vertical-align:middle;'>商家Id</th>"								
								+"<th style='text-align:center;vertical-align:middle;'>用户Id</th>"
								+"<th style='text-align:center;vertical-align:middle;'>收获地址</th>"
								+"<th style='text-align:center;vertical-align:middle;'>价格</th>"
								+"<th style='text-align:center;vertical-align:middle;'>订单状态</th>"
								+"</tr></thead>");

							$(data).each(
											function() {
												let
												tr = $("<tr class='odd gradeX'></tr>");
												let
												td_oId= $("<td style='text-align:center;vertical-align:middle;'>" + this.oId
														+ "</td>");
												let
												td_uId = $("<td style='text-align:center;vertical-align:middle;'>" + this.uId
														+ "</td>");
												;
												let
												td_bId = $("<td style='text-align:center;vertical-align:middle;'>"
														+ this.bId
														+ "</td>");
												let
												td_address = $("<td style='text-align:center;vertical-align:middle;'>" + this.adEndid
														+ "</td>");
												let td_price=$("<td  style='text-align:center;vertical-align:middle;'>"+this.oOrderprice+"</td>");
												let td_state=$("<td  style='text-align:center;vertical-align:middle;'>"+this.oShopstate+"</td>");

												$(tr).append.call($(tr),
														td_oId,td_uId, td_bId,
														td_address, td_price,
														td_state);

												$("#example2").append(tr);

											})

						},
						error : function(result) {
						}
					});
		}
	</script>

	<script src="vendors/datatables/js/jquery.dataTables.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/scripts.js"></script>
	<script src="assets/DT_bootstrap.js"></script>
	<script src="vendors/modernizr-2.6.2-respond-1.1.0.min.js"></script>

</body>

</html>
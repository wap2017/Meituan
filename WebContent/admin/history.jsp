<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<base href="/Meituan/admin/" />
<meta charset="UTF-8">
<title>美团后台管理系统</title>
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
					<li><a href="orders.jsp"><i class="icon-chevron-right"></i>
							订单管理</a></li>
					<li><a href="users.jsp"><i class="icon-chevron-right"></i>用户管理</a></li>
					<li><a href="business.jsp"><i class="icon-chevron-right"></i>商家管理</a></li>
					<li><a href="identification.jsp"><i class="icon-chevron-right"></i>认证管理</a>
					</li>
					<li class="active"><a href="history.jsp"><i class="icon-chevron-right"></i>认证记录</a>
					</li>
				</ul>
			</div>
			<!--/span-->
			<div class="span9" id="content">



				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">认证记录</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<div class="table-toolbar">
									<div id="myAlert" class="modal hide">
											<div class="modal-header">
												<button data-dismiss="modal" class="close" type="button">&times;</button>
												<h3>增加用户</h3>
											</div>
											<div class="modal-body" style="align-items:center">
												<!-- <p>Lorem ipsum dolor sit amet...</p> -->
												
												<div >
												 <div class="control-group">
												 <form action="../user/register.action" method="post" id="myForm" enctype="multipart/form-data">
														 <label class="control-label" for="focusedInput">昵称:</label>
													<input class="input-xlarge focused" name="uNickname"
														type="text" value="">                                       
														 <label class="control-label" for="focusedInput">金额:</label>
													<input class="input-xlarge focused" name="uAccount"
														type="text" value="">
														 <label class="control-label" for="focusedInput">密码:</label>
													<input class="input-xlarge focused" name="uPassword"
														type="password" value="">
														 <br/> 上传头像:<br/><input type="file" name="file"/>  
														  </form>
														 
                                                  </div>
                                                  </div>
                                                
											</div>
											<div class="modal-footer">
												<a data-dismiss="modal" class="btn btn-primary" href="#" onclick="addUser()">添加</a>
												<a data-dismiss="modal" class="btn" href="#">取消</a>
											</div>
										</div>
								</div>

								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example2">
									<thead>
										<tr>
										    <th style="text-align:center;vertical-align:middle;">头像</th>		
										    <th style="text-align:center;vertical-align:middle;">用户id</th>									
											<th style="text-align:center;vertical-align:middle;">昵称</th>
											<th style="text-align:center;vertical-align:middle;">剩余金额</th>
											<th style="text-align:center;vertical-align:middle;">操作</th>
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
											<td  style="text-align:center;vertical-align:middle;"><a>修改</a>&nbsp&nbsp&nbsp<a>删除</a></td>
											
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
						url : "../business/findAll.action",
						type : "GET",
						async: false,   // 太关键了，学习了，同步和异步的参数
						contentType : "application/json;charset=UTF-8",
						data : {},
						success : function(data) {
						
							$("#example2")
									.html("<table cellpadding='0' cellspacing='0' border='0' class='table table-striped table-bordered' id='example2'><thead><tr>"
								+"<th style='text-align:center;vertical-align:middle;'>商家名称</th>"
								+"<th style='text-align:center;vertical-align:middle;'>联系方式</th>"								
								+"<th style='text-align:center;vertical-align:middle;'>负责人</th>"
								+"<th style='text-align:center;vertical-align:middle;'>地址</th>"
								+"<th style='text-align:center;vertical-align:middle;'>状态</th>"
								+"<th style='text-align:center;vertical-align:middle;'>拒绝原因</th>"
								+"</tr></thead>");

							$(data).each(
											function() {
												let
												tr = $("<tr class='odd gradeX'></tr>");
												let
												td_oId= $("<td style='text-align:center;vertical-align:middle;'>" + this.bShopname
														+ "</td>");
												let
												td_uId = $("<td style='text-align:center;vertical-align:middle;'>" + this.sRphone
														+ "</td>");
												;
												let
												td_bId = $("<td style='text-align:center;vertical-align:middle;'>"
														+ this.sResponsible
														+ "</td>");
												let
												td_address = $("<td style='text-align:center;vertical-align:middle;'>" + this.sAddress
														+ "</td>");
												let td_price=$("<td  style='text-align:center;vertical-align:middle;'>"+this.sStatetype+"</td>");
												let td_state=$("<td  style='text-align:center;vertical-align:middle;'>"+this.sNotreason+"</td>");

												$(tr).append.call($(tr),
														td_oId,td_uId, td_bId,
														td_address, td_price,
														td_state);

												$("#example2").append(tr);

											})

						},
						error : function(result) {
							$("#select-box").html("查询失败");
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
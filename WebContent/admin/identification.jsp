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
					<li><a href="users.jsp"><i
							class="icon-chevron-right"></i>用户管理</a></li>
					<li><a href="business.jsp"><i
							class="icon-chevron-right"></i>商家管理</a></li>
					<li class="active"><a href="identification.jsp"><i
							class="icon-chevron-right"></i>认证管理</a>
					</li>
					<li><a href="history.jsp"><i
							class="icon-chevron-right"></i>认证记录</a>
					</li>
				</ul>
			</div>
                
                <!--/span-->
                <div id="myAlert" class="modal hide">
											<div class="modal-header">
											<h3>填写拒绝理由</h3>
											</div>
											 <form action="../business/reject.action" method="post" id="myForm">
											<div class="modal-body" style="align-items:center">
											   <input  type="text" id="rejectBId" name="regectBId"  value="123" style="display:none"/>
											   <textarea name="sNotreason" rows="10" cols="10"></textarea>
                                            </div>
                                            
											<div class="modal-footer">
												<a data-dismiss="modal" class="btn btn-primary" href="#" onclick="reject()">拒绝</a>
												<a data-dismiss="modal" class="btn" href="#">取消</a>
											</div>
											</form>
				</div>
                <div class="span9" id="content">
                    <div class="row-fluid">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">认证管理</div>
                                <div class="pull-right"><span id="pao" class="badge badge-info">1462</span></div>
                            </div>
                            <div id="msg" ></div>
                            <div id="cc" class="block-content collapse in" >
                            
                                <div class="row-fluid padd-bottom" >
                                  <div id="pos" class="span3">
                                      <a href="#" class="thumbnail">
                                        <img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="../business/pos/13750412082.jpg">
                                      </a>
                                  </div>
                                  <div id="back" class="span3">
                                      <a href="#" class="thumbnail">
                                        <img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="../business/back/13750412082.jpg">
                                      </a>
                                  </div>
                                  <div  id="up" class="span4"><br/><br/><br/><br/>
                                                                                                                 店铺名称:<input   type="text" value="友情麻辣烫"/><br/>
                                                                                                                 店主姓名:<input   type="text" value="张三"/><br/>
                                                                                                                 店铺地址:<input    type="text" value="东沙街24号"/><br/>
                                   </div>
                                  
                                  
                                </div>
                                  <div class="row-fluid padd-bottom">
                                  <div id="license" class="span3">
                                      <a href="#" class="thumbnail">
                                        <img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="../business/license/13750412082.jpg">
                                      </a>
                                  </div>
                                  <div  id="hygiene" class="span3">
                                      <a href="#" class="thumbnail">
                                        <img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="../business/hygiene/13750412082.jpg">
                                      </a>
                                  </div>
                                   <div  id="down" class="span4">
                                                                                                              申请时间:<input   id="apply" type="text" value="2018年4月1日"/><br/>
                                                                                                                 联系方式:<input  id="phone" type="text" value="1345***33532"/><br/>
                                         <button class="btn btn-success btn-large" onclick=accept(13750412082)>通过审核</button>
										<a href="#myAlert" data-toggle="modal" class="btn btn-danger btn-large">拒绝请求</a>     
                                   </div>
                                     
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
        <script src="vendors/jquery-1.9.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="vendors/easypiechart/jquery.easy-pie-chart.js"></script>
        <script src="assets/scripts.js"></script>
        <script type="text/javascript">
	$(function() {
 		    count();
			find();
			
	});
	
	
	function showRejectBId(e){
		$("#rejectBId").attr("value",e.getAttribute("rejectBId"));
	     
	}
  	
  	function count() {
		$.ajax({
					url : "../business/count.action",
					type : "GET",
					async: false,   // 太关键了，学习了，同步和异步的参数
					contentType : "application/json;charset=UTF-8",
					data : {},
					success : function(data) {
					    $("#pao").html(data);
					},
					error : function(result) {
						  $("#pao").html();
						
					}
				});
	}
		function find() {
			$.ajax({
						url : "../business/findBusinessWithoutIdentify.action",
						type : "GET",
						async: false,   // 太关键了，学习了，同步和异步的参数
						contentType : "application/json;charset=UTF-8",
						data : {},
						success : function(data) {
					if(data!=""){
								
							
							$("#up").html("<br/><br/><br/><br/>店铺名称:<input   type='text' value='"+data.bShopname+"'/><br/>"
                            +"店主姓名:<input   type='text' value='"+data.sResponsible+"'/><br/>"
                            +"店铺地址:<input   type='text' value='"+data.sAddress+"'/><br/>");

							var a=timeFormat(data.sApply);
							$("#down").html("申请时间:<input type='text' value='"+a+"'/><br/>"
                                          +"联系方式:<input  type='text' value='"+data.sRphone+"'/><br/>"
                                         +"<button class='btn btn-success btn-large' onclick=accept("+data.bId+")>通过审核</button>&nbsp&nbsp&nbsp"
							+"<a href='#myAlert' data-toggle='modal' class='btn btn-danger btn-large' onclick=showRejectBId(this) rejectBId="+data.bId+" >拒绝请求</a>");   
							$('#pos').html("<a href='#' class='thumbnail'>"
                            +" <img data-src='holder.js/260x180' alt='260x180' style='width: 260px; height: 180px;' src='../business/pos/"+data.bId+".jpg'>"
                            +"</a>'");
							$('#back').html("<a href='#' class='thumbnail'>"
                            +" <img data-src='holder.js/260x180' alt='260x180' style='width: 260px; height: 180px;' src='../business/back/"+data.bId+".jpg'>"
                            +"</a>'");
							$('#license').html("<a href='#' class='thumbnail'>"
                            +" <img data-src='holder.js/260x180' alt='260x180' style='width: 260px; height: 180px;' src='../business/license/"+data.bId+".jpg'>"
                            +"</a>'");data
							$('#hygiene').html("<a href='#' class='thumbnail'>"
                            +" <img data-src='holder.js/260x180' alt='260x180' style='width: 260px; height: 180px;' src='../business/hygiene/"+data.bId+".jpg'>"
                            +"</a>'");
                            
                            $("#cc").show();
                          }else{
                        	  
                        	  $("#cc").hide();
  							  $("#msg").html("暂无更多认证请求");
                          }
					
						},
						error : function(result) {
						}
					});
		}
		
		function timeFormat(nS) {     
			  return new Date(parseInt(("/Date("+nS+")/").substr(6, 13))).toLocaleDateString();     
			};
			
			function accept(bId){
				location.href="../business/accept.action?bId="+bId;
			}
			
			function  reject(bId){
				$("#myForm").submit();
			}
			
			
	</script>
      
        <script>
        $(function() {
            // Easy pie charts
            $('.chart').easyPieChart({animate: 1000});
        });
        </script>
    </body>

</html>
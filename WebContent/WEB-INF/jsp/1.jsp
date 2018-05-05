<form class="form-horizontal" >
    <label for="firstname" class="col-sm-2 control-label">用户ID</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="user_id" placeholder="请输入用户ID">
    </div>
    <div class="col-sm-offset-2 col-sm-10">
      <button type="button" id="select" class="btn btn-default">查找</button>
    </div>

</form>
<div class="panel-body">
    <h2 class="text-danger text-center">
        <!-- 用来显示查找结果 -->
        <span class="glyphicon" id="select-box"></span>
    </h2>
</div>
$(function(){
$("#select").click(function() {
            $.ajax({
                url : "peopleSelect",
                type : "POST",
                dataType:"json",
                contentType : "application/json;charset=UTF-8",
                <!-- 向后端传输的数据 -->
                data : JSON.stringify({
                    id : $("#user_id").val(),
                }),
                success:function(result) {
                    <!-- 处理后端返回的数据 -->
                    var message= JSON.stringify(result);
                    $("#select-box").html("查询成功" + message);
                },
                error:function(result){
                    $("#select-box").html("查询失败");
                }
            });
        });
});
function setImagePreview(docObj, txtSrc,localImagId, imgObjPreview) {

		var name = docObj.value;
		var type = name.split(".");
		type = type[type.length - 1];
		if ("jpg" != type && "png" != type && "jpeg" != type && "gif" != type) {
			alert("错误的类型，请选择图片");
			document.getElementById(txtSrc).value = null;//防止将非图片类型上传
			return;
		}

		if (docObj.files && docObj.files[0]) {

			//alert("hello"+docObj.files[0]);  
            //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式 
			document.getElementById(localImagId).style.display = "block";
			document.getElementById(imgObjPreview).src = window.URL
					.createObjectURL(docObj.files[0]);
		} else {
			//IE下，使用滤镜 
			docObj.select();
			var imgSrc = document.selection.createRange().text;
			//必须设置初始大小   
			localImagId.style.width = "300px";
			localImagId.style.height = "200px";

			  
			//图片异常的捕捉，防止用户修改后缀来伪造图片    
			try {
				localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
				localImagId.filters
						.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
			} catch (e) {
				alert("您上传的图片格式不正确，请重新选择!");
				return false;
			}
			document.getElementById(imgObjPreview).style.display = 'none';
			document.selection.empty();
		}
		return true;
	}
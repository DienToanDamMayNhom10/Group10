<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:header-footer>
	<jsp:body>
	<form>
            <textarea name="editor1" id="editor1" rows="10" cols="80">
                
            </textarea>
            <button id="btnsave" style="height: 50px; width: 100px;">Save</button>
    </form>
    
    <script>
    	CKEDITOR.replace('editor1');
    	var text = '${noidung}';
    	var editor = CKEDITOR.instances['editor1'];
    	editor.setData(text);  
    	
    	$('#btnsave').click(function(e){
        	e.preventDefault();
        	$.post('upload',{
        		noidung: $(CKEDITOR.instances['editor1'].getData()).text()
        	}).done(function (result){
        		alert(result);
        	}).fail(function(){
        		alert("Lỗi, lưu thất bại!!!");
        	});
    	});
    </script>
   </jsp:body>
</t:header-footer>
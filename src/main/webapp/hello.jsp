<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hello</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
function myfun(){
	var obj = $.parseJSON('{"name":"John"}');
	alert( obj.name === "John" );
	var jj = JSON.parse('{"categoryId":1,"categoryName":"饮品","categoryImage":"/upload/yinpin.jpg"}');
	var bb = {
			name:"fadf",
			age:18
	}
	var arr = new Array();
	arr.push(jj);
	arr.push(bb);
	alert(JSON.stringify(arr));
	//alert(jj.categoryName)
	alert('${command}')
}
myfun();
</script>
</head>
<body>${command}
</body>
</html>
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
function fun(){
	var list = JSON.parse('${users}');
	for(var i in list){
		alert(JSON.stringify(list[i]));
	}
	
}
fun()
</script>
</head>
<body>${users}
</body>
</html>
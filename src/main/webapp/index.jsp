<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
	function test() {
		var user = {
			name : "zhangsan",
			sex : "男"
		}
		$.ajax({
			type : "post",
			url : "test",
			data : {
				user : JSON.stringify(user)
			},
			success : function(msg) {
				alert(JSON.stringify(msg));
			},
			error : function(msg) {
				alert(JSON.stringify(msg));
			}
		});
	}
</script>
</head>
<body>
	Hello World!
	<input type="button" onclick="test()">
</body>
</html>

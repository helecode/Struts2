<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>使用Struts实现用户登录</h2>
</form>
<h2>!动态调用</h2>
<form action="logindynamic!dynamicValidate.action" method= "post" >
用户名: <input type= "text" name="username" /><br/>
密码: <input type= "text" name= "password" /><br/>
<input type= "submit" value= "提交" />
</form>
<h2>*动态调用</h2>
<form action="S2DynamicMethodInvocation_dynamicValidate" method= "post" >
用户名: <input type= "text" name= "username" /><br/>
密码: <input type= "text" name= "password" /><br/>
<input type= "submit" value= "提交" />
</form>
</body>
</html>
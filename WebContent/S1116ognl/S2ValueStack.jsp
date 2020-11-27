<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<core:form action="valueStack!valueStack" method="post">
	<core:textfield name="username" label="用户名"></core:textfield>
	<core:textfield name="password" label="密码"></core:textfield><br/>
	<core:submit value="提交" ></core:submit>
</core:form>
</body>
</html>
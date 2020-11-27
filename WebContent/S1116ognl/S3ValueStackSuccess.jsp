<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
el<br/>
用户名:${username }<br/>
密码:${password }<br/><br/>

值栈<br/>
用户名:<s:property value="username"/><br/>
密码:<s:property value="password"/><br/><br/>

非值栈<br/>
用户名:<s:property value="#request.username"/><br/>
密码:<s:property value="#request.password"/><br/><br/>
遍历studentList集合<br/>
<s:iterator value="studentList" var="student">
	<s:property value="name"/>
	<s:property value="password"/>
	<s:property value="score"/>
</s:iterator><br/>
</body>
</html>
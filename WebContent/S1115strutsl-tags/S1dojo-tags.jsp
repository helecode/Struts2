<!-- jar包的导入方式 -->
<%@taglib uri="/struts-dojo-tags" prefix="ajaxjar" %>
<%@taglib uri="/struts-tags" prefix="corejar" %>
<!-- tld文件的导入方式 -->
<%@taglib uri="/WEB-INF/struts-dojo-tags.tld" prefix="ajaxtld"%>
<%@taglib uri="/WEB-INF/struts-tags.tld" prefix="coretld"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax</title>
<ajaxjar:head/>
</head>
<body>
	<corejar:url id="time" value="/S1115strutsl-tags/S2time.jsp"/>
	<corejar:url id="time2" value="time.action"/>
	<corejar:url id="logindynamic" value="logindynamic!dynamicValidate.action"/>
	<!-- 加载页面自动触发ajax实现ajax局部刷新 -->
	<ajaxjar:div id="div1" cssStyle="border:1px solid red;" updateFreq="500" href="%{time}">
		初始的内容
	</ajaxjar:div><br/>
	<ajaxjar:div id="div2" cssStyle="border:1px solid red;" updateFreq="500" href="%{time2}">
		初始的内容
	</ajaxjar:div><br/>
	<!-- 通过submit按钮触发action实现ajax局部刷新 -->
	<corejar:form action="%{logindynamic}" method="post" theme="simple">
		<corejar:textfield name="username"> </corejar:textfield><br/>
		<corejar:textfield name="password"> </corejar:textfield><vr/>
	</corejar:form>
	<ajaxjar:submit value="222"></ajaxjar:submit>
	<ajaxjar:submit href="logindynamic!dynamicValidate.action" value="sdsdsd"></ajaxjar:submit>
	<br/>
	<!-- 连接点击触发action实现ajax局部刷新，异常传输 -->
	<ajaxjar:a href="login.action">ssss</ajaxjar:a>
	
</body>
</html>
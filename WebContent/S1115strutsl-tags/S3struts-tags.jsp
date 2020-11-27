<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 条件判断标签 -->
<s:if test="3>6">
	<h2>3>6</h2>
</s:if>
<s:elseif test="5>6">
	<h2>5>6</h2>
</s:elseif>
<s:else>
	<h2>3and5 <6</h2>
</s:else>
<!-- 迭代遍历标签 -->
<%
//定义集合或数组
//1. 定义数组
String s[]={"hello","world","good"}; //对象数组
request.setAttribute("ss", s);
//2. List集合
java.util.List<String> all=new java.util.ArrayList<String>();
all.add("two");
all.add("one");
all.add("five");
request.setAttribute("alllist", all);
//3. Map集合
java.util.Map<String,String> map=new java.util.TreeMap<String,String>();
map.put("a","lisi");
map.put("b","wangwu");
map.put("c","zhangsan");
request.setAttribute("mm", map);
%>
<h2>--数组元素为---</h2>
<s:iterator value= "#request.ss" id= "arr" >
<s:property value= "#arr" />
</s:iterator>
<h2>--集合元素为---</h2>
<s:iterator value= "#request.alllist" id= "a" >
<s:property value="#a" />
</s:iterator>
<h2>--Map集合元素为---</h2>
<s:iterator value= "#request.mm" id= "m1" >
<s:property value= "#m1.key" />--<s:property value= "#m1.value" />
</s:iterator>
<h2>--List集合对象元素---</h2>
<s:iterator value= "#request.p" id= "pp" >
<h2><s:property value= "#pp.name" />----<s:property value= "#pp.age" /></h2>
</s:iterator>

</body>
</html>
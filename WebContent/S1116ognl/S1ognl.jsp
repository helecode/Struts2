<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ognl</title>
</head>
<body>
1.设置属性<br/>
<s:set name="name1" value="'李四'" scope="request"></s:set>
<s:set name="age" value="22" scope="session"></s:set>
<s:set name="score"  value="82" scope="application"></s:set>
<s:set name="count" value="5"></s:set>
姓名：<s:property value="#request.name1"/><br/>
年龄：<s:property value="#session.age"/><br/>
分数：<s:property value="#application.score"/><br/>
数量：<s:property value="#count"/><br/><!-- 属性默认request范围，如果request范围可不加request前缀 -->
<br/>
2.构造数组
<s:set value="new int[]{23,4,67,43,5}" name="arr" scope="request"></s:set>
数组首元素：<s:property value="#request.arr.length"/><br/>
数组元素个数：<s:property value="#request.arr[0]"/><br/>
数组元素遍历：<s:iterator value="#request.arr" id="a">
				<s:property value="#a"/>
				</s:iterator><br/>
<br/>
3.构造集合<br/>
<s:set name="re" value="{'hello','world','good'}" scope="request"></s:set>
取出集合第一个元素：<s:property value="#request.re[0]" /><br/>
取出集合元素个数：<s:property value="#request.re.size"/><br/>
取出集合：<s:property value="#request.re"/><br/>
集合遍历：<s:iterator value="#request.re" id="r">
			<s:property value="#r"/>
		 </s:iterator><br/>
<br/>
4.构造Map<br/>
<s:set name= "map" value= " #{'cn':'China','us':'the United
States','fr':'France','jp':'Japan'} " ></s:set>
map集合元素个数: <s:property value= "#map.size" /><br/>
map集合首元素值: <s:property value= "#map['cn']" /><br/>
map集合的所有元素如下: </h2>
<s:iterator id= "m" value= "#request.map" >
<s:property value= "#m.key" />---
<s:property value= "#m.value" />
</h2>
</s:iterator>
</body>
</html>
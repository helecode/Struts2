<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
上传文件的路径:<%=request.getContextPath() %><br/>
上传文件的路径:<%=request.getServletPath() %><br/>
上传文件的路径:<%=request.getRequestURL()%><br/>
上传文件的路径:<%=request.getRealPath("/") %><br/>
<!-- 文件上传 -->
<form action="upload" method="post" enctype="multipart/form-data">
上传文件：<input type="file" name=upload><br/>
<input type="submit" value="提交">
</form>
<!-- 文件下载 -->
<h2><a href="filedown?fileName=362525199807161534.jpg">文件下载</a></h2>
</form>
</body>
</html>
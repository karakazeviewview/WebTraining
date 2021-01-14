<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.InchCm"%>
<%
	InchCm size=(InchCm)request.getAttribute("size");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>
<p><%=inch%>inchは<%=size.getCm() %>cmです。</p>
<a href="/converter/Main">戻る</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%
Person person=(Person)request.getAttribute("person");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>shinorelay</title>
</head>
<body>
<h1>先行走者のレコーズ</h1>
バトンを渡してくれた偉大な先人ランナーの作品とスコア
<form action="/connectLesson/Update" method="post">
作品名:<input type="text" name="name" value="<%=person.getName() %>"><br>
スコア:<input type="number" name="age" value="<%=person.getAge() %>"><br>
<input type="hidden" name="id" value="<%=person.getId() %>"><br>
<button type="submit">更新</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>shinorelay</title>
</head>
<body>
<h1>先行走者のレコーズ</h1>
バトンを渡してくれた偉大な先人ランナーの作品とスコア
<form action="/connectLesson/Create" method="post">
作品名:<input type="text" name="name"><br>
スコア:<input type="number" name="age"><br>
<button type="submit">登録</button>
</form>

</body>
</html>
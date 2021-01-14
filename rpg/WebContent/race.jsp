<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert race here</title>
</head>
<body>

<form action="/rpg/Logic.java" method="post">
種族を選んでください
<label><input type="radio" name="race" value="1">人間</label>
<label><input type="radio" name="race" value="2">ハイエルフ</label>
<label><input type="radio" name="race" value="3">トロル</label>
<label><input type="radio" name="race" value="4">ノーム</label>
<input type="submit" value="決定">

</form>
</body>
</html>	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
import java.util.*;
<%// ぐーちょきぱー定数定義
			int GU = 0;
			int CHOKI = 1;
			int PA = 2;
			// プレイヤーとコンピュータ
			int player;
			int com;
			// プレイヤーとコンピュータの手
			String te1;
			String te2;
			// プレイヤーの出す手を入力で決める
			System.out.print("じゃんけんの手を入力して！ぐー:0, ちょき:1,ぱー:2>");
			Scanner sc = new Scanner(System.in);
			int hand1 = sc.nextInt();
			switch (hand1) {
			case 0:
				player = GU;
				te1 = "ぐー";
				break;
			case 1:
				player = CHOKI;
				te1 = "ちょき";
				break;
			case 2:
				player = PA;
				te1 = "ぱー";
				break;
			}
			// コンピュータの出す手を乱数で決める
			Random random = new Random();
			int hand2 = random.nextInt(3);
			switch (hand2) {
			case 0:
				com = GU;
				te2 = "ぐー";
				break;
			case 1:
				com = CHOKI;
				te2 = "ちょき";
				break;
			case 2:
				com = PA;
				te2 = "ぱー";
				break;
			}

			// 判定
			if (janken.player == 0 && janken.com == 1) {
				System.out.println("アナタのかちです！");
			} else if (janken.player == 1 && janken.com == 2) {
				System.out.println("アナタのかちです！");
			} else if (janken.player == 2 && janken.com == 0) {
				System.out.println("アナタのかちです！");
			} else if (janken.player == janken.com) {
				System.out.println("ひきわけ");
			} else {
				System.out.println("コンピュータのかちです！");
			}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css"
	rel="stylesheet">
<title>じゃんけんぽん</title>
</head>
<body>
	<form method="post">
		<input type="radio" name="hand" value="0">ぐー<br> <input
			type="radio" name="hand" value="1">ちょき<br> <input
			type="radio" name="hand" value="2">ぱー<br>
		<button type="submit" name="btn">ショウブ</button>
	</form>
	<div>
		<img src="images/choki.png"> <img src="images/pa.png">
	</div>
	<p>アナタのかちです！</p>
</body>
</html>
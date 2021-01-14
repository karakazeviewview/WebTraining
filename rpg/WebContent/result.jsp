<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP i</title>
    </head>
    <body>
        <form method="post" action="./FormServlet">
        ***作成成功!***
私は<%=job %>戦士の<%=race %>>、<%=name %>
能力値(<%=totP%>)を高い順に並べると
体力:<%=vitP %>
魔力:<%=magP %>
きようさ:<%=dexP %>
すばやさ:<%=aglP %>
パワー:<%=powP %>
です。今後ともよろしく…。
        </form>
    </body>
</html>
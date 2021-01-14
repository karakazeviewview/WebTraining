<%@page contentType="text/html; charset=utf-8"
import="ex.*"%>
<%
Employee emp=new Employee("0001","湊雄輔");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
<%for(int i=0;i<10;i++){%>
<%if(i%3==0){ %>
<p style="color:red">
<%}else{ %>
<p>
<%} %>
IDは<%=emp.getId() %>,名前は<%=emp.getName() %>です</p>
<%} %>
</p>
</body>
</html>

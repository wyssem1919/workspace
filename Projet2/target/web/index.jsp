<%@page import="iset.sem31.test1.Fonctions" %>
<%
int number=0; int res=0;
String action=request.getParameter("action");
if (action!= null)
{
number = Double.parseDouble(request.getParameter("t1"));
Fonctions fact = new Fonctions();
res=fact(number);
}
%>
<html>
<body>
<form action="index.jsp" method="post">
<center>
Donner N : <input type="text" name="t1" value="<%=number%>"><br>
<input type="button" name="b1" value="Factorielle"> : <%=res%>
</center>
</form>
</body>
</html>

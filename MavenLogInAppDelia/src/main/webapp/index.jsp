<html>
<body>
<h2>TUTORIALS</h2>
<a href="login.jsp">/admin</a>
<% if (session.getAttribute("loggedIn") != null) { %>
<p> IS LOGGED ! </p>

<form action="ServletLogout" method="post">
    <input type="submit" name="buttonLogOut" value="LOG OUT" />
</form>

<% } else {%>
<p> IS NOT LOGGED ! </p>
<% } %>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>LOGIN FORM</title>
  <link href="../css/loginstyle.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form action="loginServlet" method="post">
      NAME : <input type="text" name="userName"><br>
      PASSWORD : <input type="password" name="userPassword"><br>
      <input type="submit" value="SUBMIT">

        <div style="color: #FF0000;">${errorMessage}</div>
    </form>
</body>
</html>

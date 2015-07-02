<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>
        Login
    </title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/login_style.css">
    <div class="page-header">
        <h3 align="center">Team Tango <small>A web programming team</small></h3>
    </div>
</head>
<body background="../images/blue_wallpaper2.jpg">
<br>

<form class="form-horizontal" action="loginServlet" method="post">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
        <div class="col-sm-4" id="input">
            <input name="userName" type="text" class="form-control" id="inputEmail3" placeholder="Username">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-4">
            <input name="userPassword" type="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Log in</button>
            <div style="color: #FF0000;">${errorMessage}</div>
        </div>
    </div>
</form>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<footer class="footer">
    <div class="container">
        <p>All rights reserved <b>Team Tango</b></p>
    </div>
</footer>

</body>
</html>

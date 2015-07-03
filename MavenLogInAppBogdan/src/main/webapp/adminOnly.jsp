<%--
  Created by IntelliJ IDEA.
  User: DRAGOS_M
  Date: 7/1/2015
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>
      User only page
    </title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/login_style.css">

    <div class="page-header">
      <h3 align="center">Team Tango <small>A web programming team</small></h3>
    </div>

    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>

    <script>
        $(document).ready(function(){
            $("button").click(function(){
                $("#div1").fadeToggle(1000);
                $("#div2").fadeToggle(2000);
                $("#div3").fadeToggle(3000);
                $("#div4").fadeToggle(4000);
                $("#div5").fadeToggle(5000);
            });
        });
    </script>

</head>
<body background="images/blue_wallpaper2.jpg">

<div id="wrapper">
    <div id="header">
        <h3>
            This page is only accessible by a logged in user. <br>
            This are all the resources used to create this:
        </h3>
    </div>

    <br><br>

    <div id="content">

        <button>Click to show/hide documentation</button>

        <div class="list-group" id="div1">
            <a href="http://www.tutorialspoint.com/servlets" class="list-group-item">Servlets Tutorial</a>
        </div>

        <div class="list-group" id="div2">
            <a href="http://www.tutorialspoint.com/maven" class="list-group-item">Maven Tutorial</a>
        </div>

        <div class="list-group" id="div3">
            <a href="http://www.tutorialspoint.com/design_pattern/mvc_pattern.htm" class="list-group-item">MVC
                pattern</a>
        </div>

        <div class="list-group" id="div4">
            <a href="http://www.slideshare.net/dnene/rest-representational-state-transfer-explained"
               class="list-group-item">State transfer explained</a>
        </div>

        <div class="list-group" id="div5">
            <a href="http://www.codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet"
               class="list-group-item">Handling html form data</a>
        </div>

    </div>

    <div id="footer">
        <div class="box" align="right">
            <p>All rights reserved <b>Team Tango</b></p>
        </div>
    </div>

</div>
</body>
</html>

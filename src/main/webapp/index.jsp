<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%--
    Document   : test
    Created on : 11-jan-2017, 9:12:34
    Author     : gwnni
--%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>F R E E D A N K M E M S</title>
    <style>
        body {
            background: url(https://media.giphy.com/media/rXGRKiKEvg4Ba/giphy.gif) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            margin: 0;
        }
    </style>
    <footer>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </footer>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="http://localhost:8080">AnimalKingdom</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="http://localhost:8080/test">test</a></li>
            <li><a href="http://localhost:8080/overview">All animals</a></li>
            <li><a href="http://localhost:8080/humans">All humans</a></li>
            <li><a href="http://localhost:8080/cageoverview">All cages</a></li>
            <li><a href="http://localhost:8080/animalsNoHuman">All animals(no humans)</a></li>
            <li><a href="http://localhost:8080/addanimal">Adding Animals</a></li>
            <li><a href="http://localhost:8080/marry">Marry</a></li>
        </ul>
    </div>
</nav>


</body>
</html>

<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gwnni
  Date: 25-1-2017
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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


<table border="2" cellpadding="15" width="1200">

    <tr>
        <td style="color: white"> Class</td>
        <td style="color: white"> Name</td>
        <td style="color: white"> insertion</td>
        <td style="color: white"> Last Name</td>
        <td style="color: white"> Gender</td>
        <td style="color: white"> Max number of Eggs</td>
        <td style="color: white"> Partner</td>
        <td style="color: white"> BirthControl</td>

    </tr>
    <%--suppress ELValidationInJSP --%>
    <c:forEach var="p" items="${Human}">

        <tr>
            <td style="color: white">${p.getClass().getSimpleName()}</td>
            <td style="color: white">${p.getName()}</td>
            <td style="color: white">${p.getInsertion()}</td>
            <td style="color: white">${p.getLastName()}</td>
            <td style="color: white">${p.getGender().getClass().getSimpleName()}</td>
            <td style="color: white">${p.getMaxNumberOfEggs()}</td>
            <td style="color: white">${p.getPartner().getName()}</td>
            <td style="color: white">${p.getUsesbirthcontrol()}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>

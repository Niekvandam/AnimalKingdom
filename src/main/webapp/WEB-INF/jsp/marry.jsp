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
        <
        link href

        =
        "
        <c:url value='/resources/style.css' />
        "
        rel

        =
        "stylesheet"
        >
        body {
            background: url(https://media.giphy.com/media/rXGRKiKEvg4Ba/giphy.gif) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }

        <
        link href

        =
        "
        <c:url value='/resources/style.css' />
        "
        rel

        =
        "stylesheet"
        >
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

<table border="2" cellpadding="15" width="1200" class="person1">

    <tr>
        <td style="color: white"> Name</td>
    </tr>
    <%--suppress ELValidationInJSP --%>
    <c:forEach var="p" items="${Human}">
    <tr data-uuid="${animal.getID()}">
        </c:forEach>


</table>

<table border="2" cellpadding="15" width="1200" class="person2">

    <tr>
        <td style="color: white"> Name</td>
    </tr>
    <%--suppress ELValidationInJSP --%>
    <c:forEach var="p" items="${Human}">
    <tr data-uuid="${animal.getID()}">
        </c:forEach>


</table>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script type="text/javascript">

    $(document).ready(function () {

        $('tr').on('click', function () {

            $(this).addClass('highlight').siblings().removeClass('highlight');

        });


        $('#marryBtn').on('click', function (event) {

            event.preventDefault();

            var formData = {

                "maleUUID": $('.person1 tr.highlight').data('uuid'),

                "femaleUUID": $('.person2 tr.highlight').data('uuid')

            };;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

            $.ajax({

                url: "marry",

                type: "POST",

                contentType: "application/json; charset=utf-8",

                data: JSON.stringify(formData),

                async: false,

                cache: false,

                processData: false,

                success: function (resposeJsonObject) {

                    console.log("done");

                }

            });

        });

    });

</script>
</body>
</html>

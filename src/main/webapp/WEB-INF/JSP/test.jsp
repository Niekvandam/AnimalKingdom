
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : test
    Created on : 11-jan-2017, 9:12:34
    Author     : gwnni
--%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>F R E E  D A N K  M E M S</title>
    <style>
        body {

        }
    </style>
</head>

<body>
<h1>Hello ${p.getName()}! </h1>
<table border="2" cellpadding="15" width="1200">
    <tr>
        <td> Leeftijd</td>
        <td> Naam</td>
    </tr>

    <c:forEach var="p" items="${parrots}">
        <tr>
            <td>${p.getAge()}</td>
            <td>${p.getName()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: cimbo
  Date: 25.05.2021
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>PetClinicTitle</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <td>ID</td>
            <td>First Name</td>
            <td>Last Name</td>
        </tr>
        </thead>
        <c:forEach items="${owners}" var="owner">
            <tr>
                <td>${owner.id}</td>
                <td>${owner.firstName}</td>
                <td>${owner.lastName}</td>
            </tr>

        </c:forEach>

    </table>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page isELIgnored="false" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Emps Page</title>
</head>
<body>
    <table cellpadding="1">
            <tr>
            <td>ID</td>
            <td>LastName</td>
            <td>Email</td>
            <td>Gender</td>
            </tr>


        <c:forEach items="${emps}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.lastName}</td>
                <td>${emp.email}</td>
                <td>${emp.gender}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

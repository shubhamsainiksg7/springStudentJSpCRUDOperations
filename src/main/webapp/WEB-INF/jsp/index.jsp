<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType = "text/html; charset = UTF-8" isELIgnored="false" %>

<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h2><c:out value="${message}"></c:out></h2>

<h2 align="center">Student Management</h2>
<form action="/addstudent" method="post">
    <table align="center">
        <tr><td><button type="submit" style="font-size: 20px;">Add Student</button></td></tr>
    </table>
</form>
<br>
<form action="/viewStudent" method="post">
    <table align="center">
        <tr>
    <td><button type="submit" style="font-size: 20px;">view student</button></td>
        </tr>
    </table>

</form>
</table>
</body>
</html>

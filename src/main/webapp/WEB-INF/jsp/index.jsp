<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType = "text/html; charset = UTF-8" isELIgnored="false" %>

<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h2 style="color: green;"><c:out value="${modelAndView.deleteStatus}"/></h2>
<h2>Student Management</h2>
<form action="/addstudent" method="post">
    <button type="submit" style="font-size: 20px;">Add Student</button>

<%--
</form>
<form action="/deletestudent" method="post">
    <button type="submit" style="font-size: 20px;">Delete Student</button>

</form>
<form action="/updatestudent" method="post">
    <button type="submit" style="font-size: 20px;">Update Student</button>

</form>
--%>

</form>
<form action="/viewStudent" method="post">
    <button type="submit" style="font-size: 20px;">view student</button>

</form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: dz-jp-11
  Date: 21/6/19
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>view student details</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>

    <h2 align="center" style=" color: indianred;" class="alert alert-info">Student List</h2>
    <br>
    <c:if test="${students != null}">

        <table align="center" class="table table-hover table-bordered" style="width: 70%;">
            <tr style="background-color: silver;">
                <th>Student Id</th>
                <th>Student Name</th>
                <th>Student Father Name</th>
                <th>Student Age</th>
                <th>delete</th>
                <th>update</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><c:out value="${student.getid()}" /></td>
                    <td><c:out value="${student.getname()}" /></td>
                    <td><c:out value="${student.getfatherName()}" /></td>
                    <td><c:out value="${student.getage()}" /></td>
                    <td><a href="<c:url value='deletedata/${student.id}' />" ><input type="button" value="delete"></a></td>
                    <td><a href="<c:url value='updatedata/${student.id}' />" ><input type="button" value="update"></a></td>
                </tr>
            </c:forEach>

        </table>
        <tr><td colspan="2"><a href="/" method="POST"><center><input type="button"  class="btn btn-primary" value="cancel" align="middle"/></center></a></td></tr>
    </c:if>

</table>
</body>
</html>

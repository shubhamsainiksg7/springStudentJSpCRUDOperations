<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: dz-jp-11
  Date: 21/6/19
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>update student</title>
</head>
<body>
<h2 align="center" style="color: indianred;" class="alert alert-info">Update Student</h2>
<br>
<form action="/updatedata" method="POST">
    <table align="center" style="width: 35%;" class="table table-hover table-bordered">
        <tr>
            <td>ID:</td>
            <td>
                <input type="text" id="studnetid" value=<c:out value="${student.id()}"/> name="id" readonly/>
            </td>
        </tr>
        <tr><td> <br></td></tr>
        <tr><td>Name:</td><td><input type="text" id="name" name="name" value=<c:out value="${student.name()}"/> required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td>Father Name:</td><td><input type="text" id="fatherName"  name="fatherName" value=<c:out value="${student.fatherName()}"/> required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td>Age:</td><td><input type="text" id="age" name="age" value=<c:out value="${student.age()}"/> required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td colspan="2"><center><input type="submit" class="btn btn-primary" value="update Student" align="middle"/></center></td></tr>
        <tr><td colspan="2"><a href="/" method="POST"><center><input type="button"  class="btn btn-primary" value="cancel" align="middle"/></center></a></td></tr>
    </table>
</form>
</body>
<script type="text/javascript">
    $(document).ready(function(){
        $("#studentid, #name, #fatherName, #age").click(function() {
            $("#msgDiv").hide();
        });
    });
</script>
</html>


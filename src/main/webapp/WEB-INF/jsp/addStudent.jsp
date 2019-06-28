<%--
  Created by IntelliJ IDEA.
  User: dz-jp-11
  Date: 21/6/19
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add student details</title>
</head>
<body>


<h2 align="center" style="color: indianred;" class="alert alert-info">Add Student</h2>

<br>
<tr><td colspan="2"><a href="/" method="POST"><center><input type="button"  class="btn btn-primary" value="Back to Home" align="Right"/></center></a></td></tr><br><br>
<form action="/insertData" method="POST">
    <table align="center" style="width: 35%;" class="table table-hover table-bordered">
        <tr><td>Name:</td><td><input type="text" id="name" name="name" required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td>Father Name:</td><td><input type="text" id="fatherName" name="fatherName" required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td>Age:</td><td><input type="text" id="age" name="age" required/></td></tr>
        <tr><td> <br></td></tr>
        <tr><td colspan="2"><center><input type="submit" class="btn btn-primary" value="Add Student" align="middle"/></center></td></tr>

    </table>
</form>
</body>
<script type="text/javascript">
    $(document).ready(function(){
        $("#name, #fatherName, #age").click(function() {
            $("#msgDiv").hide();
        });
    });
</script>
</html>

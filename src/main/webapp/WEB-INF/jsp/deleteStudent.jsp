<%--
  Created by IntelliJ IDEA.
  User: dz-jp-11
  Date: 21/6/19
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete student</title>
</head>
<body>
<h2 align="center" style="color: indianred;" class="alert alert-info">Delete Student</h2>
<br>
<form action="/deletedata" method="POST">
    <table align="center" style="width: 35%;" class="table table-hover table-bordered">
        <tr><td>Student Id:</td><td><input type="text" id="studentid" name="id" required/></td></tr>
        <tr><td><br></td></tr>
        <tr><td colspan="2"><center><input type="submit" class="btn btn-primary" value="delete Student" align="middle"/></center></td></tr>
        <tr><td colspan="2"><a href="/" method="POST"><center><input type="button"  class="btn btn-primary" value="cancel" align="middle"/></center></a></td></tr>
    </table>
</form>
</body>
<script type="text/javascript">
    $(document).ready(function(){
        $("#studentid").click(function() {
            $("#msgDiv").hide();
        });
    });
</script>

</html>
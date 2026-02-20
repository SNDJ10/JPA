<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<body>

<h2>Student Details Form</h2>

<form action="student" method="post">

    ID:
    <input type="number" name="id" required />
    <br><br>

    Name:
    <input type="text" name="name" required />
    <br><br>

    College:
    <input type="text" name="college" required />
    <br><br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>

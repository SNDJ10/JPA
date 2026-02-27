<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>

<h2>Student Registration Form</h2>

<form action="list" method="post">

    <!-- ID -->
    <label>ID:</label>
    <input type="number" name="id" required><br><br>

    <!-- Name -->
    <label>Name:</label>
    <input type="text" name="name" required><br><br>

    <!-- College -->
    <label>College:</label>
    <input type="text" name="college" required><br><br>

    <!-- Mobile Number -->
    <label>Mobile Number:</label>
    <input type="tel" name="mobileNumber" required><br><br>

    <!-- Gender (Radio Button) -->
    <label>Gender:</label>
    <input type="radio" name="gender" value="Male" required> Male
    <input type="radio" name="gender" value="Female"> Female
    <input type="radio" name="gender" value="Other"> Other
    <br><br>

    <!-- Qualification (Select Dropdown) -->
    <label>Qualification:</label>
    <select name="qualification" required>
        <option value="">--Select--</option>
        <option value="SSLC">SSLC</option>
        <option value="PUC">PUC</option>
        <option value="Diploma">Diploma</option>
        <option value="BE">BE</option>
        <option value="BCA">BCA</option>
        <option value="MCA">MCA</option>
    </select>
    <br><br>

    <input type="submit" value="Submit">
<button type="button">
    <a href="read">readall</a>
</button>
</form>

</body>
</html>

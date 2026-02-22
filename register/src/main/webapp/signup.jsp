<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign Up</title>
<style>
body{
    font-family: Arial;
}
.form-box{
    width:350px;
    margin:80px auto;
    padding:20px;
    border:1px solid #ccc;
    border-radius:8px;
}
input{
    width:100%;
    padding:10px;
    margin:8px 0;
}
button{
    width:100%;
    padding:10px;
    background-color:#27ae60;
    color:white;
    border:none;
    cursor:pointer;
}
button:hover{
    background-color:#219150;
}
</style>
</head>
<body>

<div class="form-box">
<h2>Sign Up</h2>

<form action="register" method="get">
    <input type="text" name="userName" placeholder="Enter Name" required>

    <input type="email" name="gmail" placeholder="Enter Email" required>
    <input type="password" name="password" placeholder="Enter Password" required>
    <input type="password" name="confirmPassword" placeholder="Confirm Password" required>
 <input type="text" name="mobileNumber" placeholder="Enter Your Mobile Number" required>
 <p style="color:red">${error}</p>

    <button type="submit">Register</button>
    <button type="reset" style="background-color:red;margin-top:5px;">Clear</button>
</form>

</div>

</body>
</html>

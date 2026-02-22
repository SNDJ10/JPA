<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign In</title>
<style>
body{
    font-family: Arial;
}
.form-box{
    width:350px;
    margin:100px auto;
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
    background-color:#2980b9;
    color:white;
    border:none;
    cursor:pointer;
}
button:hover{
    background-color:#1f6690;
}
</style>
</head>
<body>

<div class="form-box">
<h2>Sign In</h2>
<form action="signin" method="get">

    <input type="email" name="gmail" placeholder="Enter Gmail" required>

    <input type="password" name="password" placeholder="Enter Password" required>
<p style="color:red">${error}</p>

    <button type="submit">Login</button>

</form>


</div>

</body>
</html>

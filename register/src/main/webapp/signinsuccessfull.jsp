<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Successful</title>
<style>
body{
    font-family: Arial;
    background-color:#f4f6f9;
    margin:0;
}

.navbar{
    background-color:#2c3e50;
    padding:15px;
}
.navbar a{
    color:white;
    text-decoration:none;
    margin:20px;
    font-size:18px;
}
.navbar a:hover{
    color:yellow;
}

.success-box{
    width:400px;
    margin:120px auto;
    padding:30px;
    background-color:white;
    border-radius:10px;
    box-shadow:0 0 10px rgba(0,0,0,0.1);
    text-align:center;
}

.success-box h2{
    color:green;
}

button{
    padding:10px 20px;
    margin-top:20px;
    background-color:#e74c3c;
    color:white;
    border:none;
    cursor:pointer;
    border-radius:5px;
}
button:hover{
    background-color:#c0392b;
}
</style>
</head>
<body>

<div class="navbar">
    <a href="index">Home</a>
    <a href="signup">Sign Up</a>
    <a href="signin">Sign In</a>
</div>

<div class="success-box">
    <h2> Login Successful!</h2>
    <p>Welcome back, <b>${username}</b> 🎉</p>
    <p>You have successfully signed in.</p>

    <form action="signin" method="get">
        <button type="submit">Logout</button>
    </form>
</div>

</body>
</html>

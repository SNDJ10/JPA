<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="1">
  <tr>
   
    <th> name</th>
    <th> college</th>
    <th>mobileNumber</th>
    <th> gender</th>
    <th> qualification</th>
    
  </tr>
  <c:forEach items="${list}" var="std">
  <tr>
    <td>${std.name}</td>
     <td>${std.college}</td>
      <td>${std.mobileNumber}</td>
       <td>${std.gender}</td>
        <td>${std.qualification}</td>
  </tr>
  </c:forEach>
    </table>
</body>
</html>
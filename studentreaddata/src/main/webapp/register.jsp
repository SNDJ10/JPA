<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="list" method="post" modelAttribute="studentDTO">

Name:
<form:input path="name"/>
<form:errors path="name" cssStyle="color:red"/><br>

College:
<form:input path="college"/>
<form:errors path="college" cssStyle="color:red"/><br>

Mobile:
<form:input path="mobileNumber"/>
<form:errors path="mobileNumber" cssStyle="color:red"/><br>

Gender:
<form:input path="gender"/>
<form:errors path="gender" cssStyle="color:red"/><br>

Qualification:
<form:input path="qualification"/>
<form:errors path="qualification" cssStyle="color:red"/><br>

<input type="submit" value="Save"/>

</form:form>
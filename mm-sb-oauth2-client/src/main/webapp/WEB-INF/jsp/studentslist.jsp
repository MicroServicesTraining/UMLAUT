<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red;">Get Students Info</h3>

	<div id="studentslist">
	<a href="http://localhost:8081/demo/oauth/authorize?client_id=clientapp&response_type=code&scope=read_profile_info">Login with Google</a>
	<%-- 	<form:form action="http://localhost:8081/oauth/token"
			method="post" modelAttribute="student">
			<p>

				<input type="hidden" name="response_type" value="code" /> <input
					type="hidden" name="client_id" value="demo-app" /> <input
					type="hidden" name="redirect_uri"
					value="http://localhost:8082/students/list" /> <input
					type="hidden" name="scope" value="read" /> <input type="SUBMIT"
					value="Get Students info" />
		</form:form> --%>
	</div>
</body>
</html>
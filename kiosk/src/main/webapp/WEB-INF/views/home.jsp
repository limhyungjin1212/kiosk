<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1>ㅇㅇ?</h1>
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="로그아웃" />
	</form:form>

</body>
</html>

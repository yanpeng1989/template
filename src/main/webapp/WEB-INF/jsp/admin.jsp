<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<c:url value='/css/main.css' />" rel="stylesheet" />
<title>main</title>
</head>
<body class="body_style">
	<div class="main_contain">
		<h1>Title : ${title}</h1>
		<h1>Message : ${message}</h1>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>
				Welcome : ${pageContext.request.userPrincipal.name} | <a
					href="<c:url value="/j_spring_security_logout" />"> Logout</a>
			</h2>
		</c:if>
	</div>
</body>
</html>

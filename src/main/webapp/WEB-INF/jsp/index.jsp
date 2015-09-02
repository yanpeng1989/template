<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
		<form name="" action="delete.do" method="get">
			<table style="border: crimson solid 1px;">
				<tr>
					<td>${name}</td>
					<td>${age}</td>
					<td></td>
				</tr>
				<tr>
					<td>ID:</td>
					<td><input type="text" name="id" /></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
		</br>
		</br>
		<form name="" action="insert.do" method="get">
			<table style="border: crimson solid 1px;">
				<tr>
					<td>ID:<input type="text" name="id" /></td>
					<td>NAME:<input type="text" name="name" /></td>
					<td>AGE:<input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>ADDRESS:<input type="text" name="address" /></td>
					<td>COMMENT:<input type="text" name="comment" /></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>

	<h1>Employee List: recent records</h1>

	<table>
		<tr >
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>City</th>
			<th>Salary</th>
		</tr>
		<tbody>
			<c:forEach items="${emplist}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.fname}</td>
					<td>${emp.lname}</td>
					<td>${emp.city}</td>
					<td>${emp.salary}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
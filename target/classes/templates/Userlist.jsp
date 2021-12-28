<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>userdetails.in</title>
	<style>
		h1{
		color:purple;
		border-style:dotted;
		width:300px;
		}
		a{
		text-decoration:none;
		color:purple;
		}
		h1{
		color:purple;
		}
		h2{
		color:purple;
		}
		table{
		background-color:pink;
		color:purple;
		}
	</style>
</head>
<body>
    <div align="center">
    <h1>USER DETAILS</h1><br>
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Users</h2><br>
			</caption>
			<thead>
				<tr>
					<th>User Name</th>
					<th>Email Id</th>
					<th>Mobile</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${listuser}">
					<tr>
						<td><c:out value="${user.uname}" /></td>
						<td><c:out value="${user.email}" /></td>
						<td><c:out value="${user.mobile}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
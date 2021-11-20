<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/style.css">
<meta charset="ISO-8859-1">
<title>Customers List</title>
</head>
<body>
List Customers
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<!-- put new button: Add Customer -->
			<!-- showFormForAdd will call our Spring Controller Mapping -->
			<input type="button" value="Add Customer"
			onclick="window.location.href='showFormForAdd'; return false;" class="add-button" />
			
			<!--  add our html table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
					</tr>
				</c:forEach>	
			</table>
		</div>
	</div>
</body>
</html>
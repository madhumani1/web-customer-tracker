<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Spring Demo - Multiple Data Sources</title>
	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<h1>Spring Demo - Multiple Data Sources</h1>
	
	<h3>Data Source 1: Employees</h3>
	
	<table class="table table-bordered table-striped">
		<thead class="table-primary">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
		</thead>
		
		<tbody>
				<!-- loop over and print our customers -->
				<c:forEach var="tempEmployee" items="${employees}">
									
					<tr>
						<td> ${tempEmployee.firstName} </td>
						<td> ${tempEmployee.lastName} </td>
						<td> ${tempEmployee.email} </td>						
					</tr>
				
				</c:forEach>
		</tbody>		
	</table>
	
	<hr>
	
	<h3>Data Source 2: Customers</h3>
	
	<table class="table table-bordered table-striped">
		<thead class="table-success">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
		</thead>
		
		<tbody>
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
									
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>						
					</tr>
				
				</c:forEach>
		</tbody>		
	</table>	
	
</div>
</body>
</html>
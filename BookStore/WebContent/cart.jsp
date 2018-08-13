<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Cart List</title>
</head>
<body>

	<div>
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	<div align=right>
		<a href="add.app">Home</a>
	</div>
	<div align="center">
		
		<jstl:if test="${sessionScope.cartList.size() > 0 }">
			<table border="10" align="center">
				<tr>
					
					<th>Book Name</th>
					<th>Price</th>
					<th>Count</th>
					<th>Product</th>
					

				</tr>
				<jstl:forEach var="cart" items="${sessionScope.cartList }">
					<tr>
						
						<td>${cart.bookName}</td>
						<td>${cart.price}</td>
						<td>${cart.bookCount}</td>
						<td>${cart.description}</td>
						

						<td><a href="delete.app?bookName=${cart.bookName}">Remove
								from cart</a></td>


					</tr>
				</jstl:forEach>
			</table>
		</jstl:if>
		
		
		<jstl:if test="${sessionScope.cartList.size() == 0 }">

			<h3>No books to display in the cart</h3>


		</jstl:if>


	</div>
	<div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
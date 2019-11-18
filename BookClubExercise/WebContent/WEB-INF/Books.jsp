<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events Page</title>
</head>
<body>
	<h1>Events Page</h1>
	<%@ include file="Navigation.html" %>
	<form action = "${pageContext.request.contextPath}/HomeServlet/addBook">
		<div>
			<label>Book Title:</label>
			<input name="title" />
		</div>
		<div>
			<label>Book Synopsis</label>
			<input name="synopsis" />
		</div>
		<div>
			<label>Author:</label>
			<input name="author" />
		</div>
		<div>
			<label>Date &amp; Time:</label>
			<input type="datetime-local" name="publicationDate" />
		</div>
		<div>
			<input type="submit" value="Add Book" />
		</div>
	</form>
	
	<table>
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Location</th>
			<th>Date and Time</th>
		</tr>
		<c:forEach items="${allEvents}" var="event">
			<tr>
				<td>${event.title}</td>
				<td>${event.description}</td>
				<td>${event.location}</td>
				<td>${event.dateTime}</td>
				<td>
					<!--Outer condition -->
					<c:choose>
						<c:when test = "${currentMember.memberId == event.memberId}">
			            	<a href="#">Delete</a>
			         	</c:when>
						<c:otherwise>
						
							<!-- Inner condition -->
							<c:choose>
								<c:when test="${event.attendersContainsIdStream(currentMember.memberId)}">
									<a href="${pageContext.request.contextPath}/HomeServlet/cancelSignup?memberId=${currentMember.memberId}&eventId=${event.eventId}">Cancel</a>
								</c:when>
								<c:otherwise>
									<a href="${pageContext.request.contextPath}/HomeServlet/signupForEvent?memberId=${currentMember.memberId}&eventId=${event.eventId}">Signup</a>
								</c:otherwise>
							</c:choose>		
							<!-- End inner condition -->
									
						</c:otherwise>
		      		</c:choose>
		      		<!-- End outer condition -->
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
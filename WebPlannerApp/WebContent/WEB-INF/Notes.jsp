<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>


<style>
  table.bottomBorder { 
    border-collapse: collapse; 
  }
  table.bottomBorder td, 
  table.bottomBorder th { 
    border-bottom: 1px solid yellowgreen; 
    padding: 10px; 
    text-align: left;
  }
</style>

<body>
	<h1>Notes Page</h1>
	<p style="color: blue;">${successMessage}</p>
	<%@ include file="Navigation.html"%>
	<form action="${pageContext.request.contextPath}/HomeServlet/addNotes">
		<div>
			<label>Notes Title:</label> <input name="title" />
		</div>
		<div>
			<label>Notes Description</label> <input name="content" />
		</div>
		<div>
			<label>Note Column:</label> <input name="notecol" />
		</div>
		<!-- 
		<div>
			<label>Date &amp; Time:</label>
			<input type="datetime-local" name="dateTime" />
		</div>
		 -->

		<div>
			<input type="submit" value="Add Notes" />
		</div>
	</form>

	<table class="bottomBorder">
		<tr>
			<th>Title</th>
			<th>Content</th>
			<th>NoteCol</th>
		</tr>
		<c:forEach items="${allNotes}" var="note">
			<tr>
				<td>${note.title}</td>
				<td>${note.content}</td>
				<td>${note.notecol}</td>
				<td><a
					href="${pageContext.request.contextPath}/HomeServlet/removeNote?noteId=${note.id}&userId=${note.userId}">Delete
						Note</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notes Page</title>
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
	<p style="color: blue;">${successMessage}</p>
	<%@ include file="Navigation.html"%>
	<form action="${pageContext.request.contextPath}/HomeServlet/addReminder">
		<div>
			<label>Reminder Type :</label> <input name="reminderType" />
		</div>
		<div>
			<label>Reminder Frequency :</label> <input name="frequency" />
		</div>
		<div>
			<label>Remarks :</label> <input name="remarks" />
		</div>
		<!-- 
		<div>
			<label>Date &amp; Time:</label>
			<input type="datetime-local" name="dateTime" />
		</div>
		 -->

		<div>
			<input type="submit" value="Add Reminder" />
		</div>
	</form>

	<table class="bottomBorder">
		<tr>
			<th>Reminder Type</th>
			<th>Frequency </th>
			<th>Remarks</th>
			<th>Is Active</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${allReminder}" var="reminder">
			<tr>
				<td>${reminder.reminderType}</td>
				<td>${reminder.frequency}</td>
				<td>${reminder.remarks}</td>
				<td>${reminder.isActive}</td>				
				<td><a
					href="${pageContext.request.contextPath}/HomeServlet/removeReminder?reminderId=${reminder.reminderId}&userId=${reminder.userId}">Reminder Completed</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
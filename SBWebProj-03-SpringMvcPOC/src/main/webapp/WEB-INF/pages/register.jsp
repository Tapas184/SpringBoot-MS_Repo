<%@ page isELIgnored="false"%>
<h1 style="text-align: center">Employee registration Form</h1>
<form method="POST">
	<table align="center">
		<tr>
			<td>Employee Id::</td>
			<td><input type="text" name="empid"
				placeholder="Enter Employee ID"></td>
		</tr>
		<tr>
			<td>Employee Name::</td>
			<td><input type="text" name="ename"
				placeholder="Enter Employee Name"></td>
		</tr>
		<tr>
			<td>Employee Salary::</td>
			<td><input type="text" name="esalary"
				placeholder="Enter Employee Salary"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
	</table>
</form>
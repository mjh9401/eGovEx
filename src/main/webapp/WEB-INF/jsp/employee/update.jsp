<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<body>
	<h1>직원정보 수정 페이지</h1>
	<form action="../employee/updateEmployee.do" method="post">
		<table>
			<tr>
				<th>번호</th>
				<td>
					<input type="text" name = "idx" required="required" value="${employeeVO.idx}">				
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name = "name" required="required" value="${employeeVO.name}">
				</td>	
			</tr>
			<tr>
				<th>부서번호</th>
				<td>
					<input type="text" name = "deptid" required="required" value="${employeeVO.deptid}">				
				</td>
			</tr>
		</table> 
		<input type="submit" value="완료">
		<input type="button" onclick="history.back();" value="뒤로가기">
	</form>
</body>
</html>
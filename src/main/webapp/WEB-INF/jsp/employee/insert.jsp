<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<style>
	
</style>
<body>
	<h1>직원정보 추가 페이지</h1>
	<form action="../employee/insertEmployee.do" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name = "name" required="required" placeholder="이름을 입력해주세요">
				</td>	
			</tr>
			<tr>
				<th>부서번호</th>
				<td>
					<input type="text" name = "deptid" required="required" placeholder="부서번호를 입력해주세요">				
				</td>
			</tr>
		</table> 
		<input type="submit" value="완료">
		<input type="button" onclick="history.back();" value="뒤로가기">
	</form>
</body>
</html>
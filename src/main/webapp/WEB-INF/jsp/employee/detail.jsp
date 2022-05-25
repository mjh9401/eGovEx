<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<style>
	a{
		text-decoration: none;
		color:inherit;
	}
	td,th{
		padding:10px 90px;
		text-align: center;
	}
	table{
		margin: 0 auto;
	}
	table,td,th{
		border: 1px,#000 solid;
		border-collapse: collapse;
	}
	th{
		background-color: #000;
		color: #fff;
	}
	.title{
		text-align: center;
	}
	.btngroup{
		width:200px;
		margin-left:60%;
	}
	button,input {
		margin-top:10px;
		margin-right:5px;
		float:right;
	}
	
}
</style>
<body>
	<div>
		<h1 class="title">직원 상세페이지</h3>
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>부서번호</th>
			</tr>
			<tr>
				<td>${employee.idx}</td>
				<td>${employee.name}</td>
				<td>${employee.deptid}</td>
			</tr>
		</table>
		<div class="btngroup">
			<button type="button">
				<a href='../employee/showUpdatingEmployee.do?idx=${employee.idx}&name=${employee.name}&deptid=${employee.deptid}'>수정</a>
			</button>
			<input type="button" onclick="location.href='../employee/deleteEmployee.do?idx=${employee.idx}'" value="삭제">
			<button onclick="history.back();">뒤로가기</button>
		</div>
	</div>
</body>
</html>
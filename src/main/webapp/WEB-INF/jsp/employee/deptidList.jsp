<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서번호</title>
</head>
<style>
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
			<c:forEach items="${employeeList}" var="employeeVO">
				<tr>
					<td>${employeeVO.idx}</td>
					<td>
						<a href="../employee/getEmployee.do?idx=${employeeVO.idx}">${employeeVO.name}</a>
					</td>
					<td>${employeeVO.deptid}</td>
				</tr>
			</c:forEach>
		</table>
		<div class="btngroup">
			<button onclick="history.back();">뒤로가기</button>
		</div>
</div>
</body>
</html>
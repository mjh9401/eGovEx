<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<style>
	.wrap{
		width: 800px;
		margin: 0 auto;
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
		width:600px;
		
	}
	button{
		margin-top: 20px;
		margin-right:10px;
		float:right;
	}
</style>
<body>
	<div class="wrap">
		<h1 class="title">전체직원 관리페이지</h1>
		<!--<p><c:out value="${date}"/></p>-->
		<c:set var="dt" value="${date}"/>
		<!--<span><fmt:formatDate value="${dt}" type="date"/></span>
		<span><fmt:formatDate value="${dt}" type="time"/></span>
		<span><fmt:formatDate value="${dt}" type="both"/></span>
		<span><fmt:formatDate value="${dt}" type="both" dateStyle="default" timeStyle="default"/></span>
		<span><fmt:formatDate value="${dt}" type="both" dateStyle="short" timeStyle="short"/></span>
		<span><fmt:formatDate value="${dt}" type="both" dateStyle="medium" timeStyle="medium"/></span>
		<span><fmt:formatDate value="${dt}" type="both" dateStyle="long" timeStyle="long"/></span>
		<span><fmt:formatDate value="${dt}" type="both" dateStyle="full" timeStyle="full"/></span>-->
		<span><fmt:formatDate value="${dt}" type="both" pattern="YYYY년 MM월 DD일 HH시 MM분 ss초 E요일"/></span>
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>부서번호</th>
			</tr>
			
			<c:forEach items="${employeeList}" var="employeeVO">
				<c:set var= "employee" value="${employeeVO}"/>
				<tr>
					<td>
						<c:out value="${employee.idx}"/>
					</td>
					<td>
						<a href="../employee/getEmployee.do?idx=<c:out value="${employee.idx}"/>">
							<c:out value="${employee.name}"/> 
						</a>
					</td>
					<td>
						<a href="../employee/getEmployeeByDep.do?deptId=<c:out value="${employee.deptid}"/>">
							<c:out value="${employee.deptid}"/> 
						</a>
					</td>
				</tr>			
			</c:forEach>
				
		</table>
		<button onclick="location.href='/fmis/employee/showInsertingEmployee.do'">직원정보추가</button>
	</div>
</body>
</html>
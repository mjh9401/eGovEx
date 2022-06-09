<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<fmt:setLocale value="ko" scope="request"/>
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
		<c:set var="dt" value="${date}"/>
		<!--<span><fmt:formatDate value="${dt}" type="both" pattern="yyyy년 MM월 dd일 HH시 MM분 ss초 E요일"/></span> -->
		<!--<span><spring:message code="hello" text="no_message"/></span>-->
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
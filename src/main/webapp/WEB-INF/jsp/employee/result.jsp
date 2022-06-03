<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>

<body>
	<c:choose>
		<c:when test="${resultInesrtNumber > 0}">
			<c:set var="state" value="1"/>
			<c:set var="insertNumber" value="true"/>
		</c:when>
		<c:when test="${resultUpdateNumber > 0}">
			<c:set var="state" value="2"/>
			<c:set var="updateNumber" value="true"/>		
		</c:when>
		<c:when test="${resultDeleteNumber > 0}">
			<c:set var="state" value="3"/>
			<c:set var="deleteNumber" value="true"/>
		</c:when>
	</c:choose>
	<script>
	 	// 상태값 1.insert, 2.update, 3.delete
		let state = '<c:out value="${state}"/>';
		// insert 상태값
		let insertStatus = '<c:out value="${insertNumber}"/>';
		// update 상태값
		let updateStatus = '<c:out value="${updateNumber}"/>';
		// delete 상태값
		let deleteStatus = '<c:out value="${deleteNumber}"/>';
		
		resultInsert(state,insertStatus);
		resultUpdate(state,updateStatus);
		resultDelete(state,deleteStatus);
		
		// insert 성공/실패 메세지 함수
		function resultInsert(state,insertStatus){
			if(state == 1){
				if(insertStatus){
					alert("직원정보가 성공적으로 추가됐습니다.");
					location.href='../employee/getEmployeeList.do';
				}else{
					alert("직원정보 삽입이 실패했습니다.");
					location.href='../employee/getEmployeeList.do';
				}	
			}
		}
		
		// update 성공/실패 메세지 함수
		function resultUpdate(state,updateStatus){
			if(state == 2){
				if(updateStatus){
					alert("직원정보 수정이 성공적으로 완료됐습니다.");
					location.href='../employee/getEmployeeList.do';
				}else{
					alert("직원정보 수정이 실패했습니다.");
					location.href='../employee/getEmployeeList.do';
				}	
			}
		}
		
		// delete 성공/실패 메세지 함수
		function resultDelete(state,deleteStatus){
			if(state == 3){
				if(deleteStatus){
					alert("직원정보 삭제가 성공적으로 완료됐습니다.");
					location.href='../employee/getEmployeeList.do';
				}else{
					alert("직원정보 삭제가 실패했습니다.");
					location.href='../employee/getEmployeeList.do';
				}	
			}
		}
		

	</script>
</body>
</html>
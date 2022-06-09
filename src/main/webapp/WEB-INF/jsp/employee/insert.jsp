<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
<script src="../../lib/jquery-3.6.0.min.js"></script>
</head>
<style>
	h1{
		text-align: center;
	}
	.wrap{
		width:800px;
		margin: 0 auto;
	}
	table{
		margin:0 auto;
	}
	td input{
		width: 300px;
		height: 20px; 
	}
	.btngroup{
		width:600px;
	}
	.btngroup input{
		float: right;
		margin-top: 10px;
		margin-left: 10px;
	}
</style>
<body>
	<h1>직원정보 추가 페이지</h1>
		<div class="wrap">
			<form:form action="../employee/insertEmployee.do" modelAttribute="employeeVO" onsubmit="return check(this);">
				<table>						
					<tr>
						<th>이름</th>
						<td>
							<form:input path="name" required="required" placeholder="이름을 입력해주세요"/>
						</td>	
					</tr>
					<tr>
						<th>부서번호</th>
						<td>
							<form:input path="deptid" required="required" placeholder="부서번호를 입력해주세요"/>				
						</td>
						</tr>
				</table>
				<div class="btngroup">
					<input type="submit" value="완료">
					<input type="button" onclick="history.back();" value="뒤로가기">
				</div>
			</form:form>
			<!-- 
			<form action="../employee/insertEmployee.do" method="post" onsubmit="return check(this);">
				<table>						
					<tr>
						<th>이름</th>
						<td>
							<input type="text" class="name" name = "name" required="required" placeholder="이름을 입력해주세요">
						</td>	
					</tr>
					<tr>
						<th>부서번호</th>
						<td>
							<input type="text" class="deptid" name = "deptid" required="required" placeholder="부서번호를 입력해주세요">				
						</td>
						</tr>
				</table>
				<div class="btngroup">
					<input type="submit" value="완료">
					<input type="button" onclick="history.back();" value="뒤로가기">
				</div> 
			</form> -->		
		</div>

	<script>
		//input 데이터 공백체크
		function check(form){
			form.name.value = form.name.value.trim();
			form.deptid.value = form.deptid.value.trim();
			
			if(form.name.value.length == 0){
				alert("다시 입력해주세요");
				return false;
			}
			
			if(form.deptid.value.length == 0){
				alert("직원번호를 다시 입력해주세요");
				return false;
			}else if(form.deptid.value == 0){
				alert("직원번호를 입력해주세요");
				return false;
			}
			
			return true;
		}

	</script>
	
</body>
</html>
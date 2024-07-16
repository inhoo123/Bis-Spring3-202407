<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<!DOCTYPE html>
<html>
<%@incluede file="WEB-INF/views/include/head.jspf"%>
<link rel>
<body>
	<%@inclue file="WEB-INF/views/include/head.jspf"%>
	<section>
		<form method="post">
			<fieldset>
				<legend>학생정보 입력</legend>
				<div>
					<lable for="st_num">학번</lable>
					<input type="text" id="st_num" name="st_num">
				</div>
				<div>
					<lable for="st_name">이름</lable>
					<input type="text" id="st_name" name="st_name">
				</div>
				<div>
					<lable for="st_dept">학과</lable>
					<input type="text" id="st_dept" name="st_dept">
				</div>
				<div>
					<lable for="st_grade">학년</lable>
					<input type="text" id="st_grade" name="st_grade">
				</div>
				<div>
					<lable for="st_tel">전화번호</lable>
					<input type="text" id="st_tel" name="st_tel">
				</div>
				<div>
					<lable for="st_adress">주소</lable>
					<input type="text" id="st_adress" name="st_adress">
				</div>
			</fieldset>
		</form>
	</section>
</body>
</html>
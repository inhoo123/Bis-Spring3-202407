<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<header class="main">
	<img src="${pageContext.request.contextPath }/static/images/myLogo.png" alt="log" width="150px" class="home"
	onClick="document.location.href=${rootPath}/"
	>
	<h1>학사정보관리 시스템</h1>
	<p>한울고교 학사관리 시스템 2024</p>
	
	<div>
		<a href="${rootPath }/user/login">로그인</a>
		<a href="${rootPath }/user/join">회원가입</a>
	</div>
</header>
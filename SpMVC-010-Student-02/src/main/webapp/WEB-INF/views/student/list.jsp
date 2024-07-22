<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<link rel="stylesheet"href="${rootPath }/static/css/student.css">	
<meta charset="UTF-8" />
<meta name="viewport" content='width=dvice-width, initial-scale=1.0'>
	<tiles:insertAttribute name="head"/>
	<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="nav"/>
	<tiles:insertAttribute name="content"/>
	</body>
<title>학사관리</title>


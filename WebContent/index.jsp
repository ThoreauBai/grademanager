<%@page import="com.grademanager.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<title>成绩管理系统</title>
</head>
<body>
	<%
		pageContext.getRequest().setAttribute("message", new Student());
	%>
	<a href="${pageContext.request.contextPath}/student/test">超链接</a>
</body>
</html>
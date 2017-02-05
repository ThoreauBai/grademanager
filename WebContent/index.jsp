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
	
	
	
	<div id="container" style="width:100%; height:100%">

		<div id="header" style="background-color: #FFA500;">
			<h1 style="margin-bottom: 0;">Main Title of Web Page</h1>
		</div>

		<div id="menu"
			style="background-color: #FFD700; height: 100%; width: 10%; float: left;">
			

		</div>

		<div id="content"
			style="background-color: #EEEEEE; height: 80%; width: 80%; float: left;">
			
			<iframe src="http://www.w3cschool.cn" style="height: 100%; width: 100%" > </iframe>
			
			</div>
			
		<div id="right"
			style="background-color: #EEEEEE; height: 100%; width: 10%; float: left;">
			
			<iframe src="index2.jsp" style="height: 100%; width: 100%" > </iframe>
			
		</div>

		<div id="footer"
			style="background-color: #FFA500; clear: both; text-align: center;">
			Copyright © W3Cschools.com</div>

	</div>
	

</body>
</html>
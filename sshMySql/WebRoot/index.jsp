<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<table>
  		<tr>
  			<th>学生编号</th>
  			<th>学生名称</th>
  			<th>学生年龄</th>
  			<th>学生性别</th>
  		</tr>
    <c:forEach items="${list}" var="stu">
    	<tr>
    		<th>${stu.stuId }</th>
    		<th>${stu.stuName }</th>
    		<th>${stu.stuAge }</th>
    		<th>${stu.stuGender }</th>
    	</tr>
    </c:forEach>
    </table>
  </body>
</html>

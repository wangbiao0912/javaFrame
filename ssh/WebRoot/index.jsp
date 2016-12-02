<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <table align="center" border="1" width="800" cellpadding="0" cellspacing="0">
    	<caption>部门信息详细表</caption>
    	<tr><th>部门编号</th><th>部门名称</th><th>部门地址</th></tr>
    	<c:forEach items="${list}" var="d">
    		<tr>
    			<td>${d.stuId}</td>
    			<td>${d.stuName}</td>
    			<td>${d.stuRemark}</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>

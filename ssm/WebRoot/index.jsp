<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
    	<c:forEach items="${pager.list}" var="d">
    		<tr>
    			<td>${d.stuId}</td>
    			<td>${d.stuName}</td>
    			<td>${d.stuRemark}</td>
    		</tr> 
    	</c:forEach>
    	<tr>
			 <td colspan="3" align="center">
				共${pager.totalRecords}条记录 
				<c:if test="${pager.pageIndex<= 1}">
    				首页&nbsp;&nbsp;上一页
    			 </c:if>
    			 <c:if test="${pager.pageIndex> 1}">
    				<a href="StudentController/queryStudentInfoByPager.html?pageIndex=${pager.firstPage}">首页</a>&nbsp;&nbsp;
    				<a href="StudentController/queryStudentInfoByPager.html?pageIndex=${pager.previousPage}">上一页</a>&nbsp;&nbsp;
    			 </c:if>
    			 <c:if test="${pager.pageIndex >= pager.totalPages}">
    			 	下一页&nbsp;&nbsp;尾页
    			 </c:if>
    			 <c:if test="${pager.pageIndex < pager.totalPages}">
    				<a href="StudentController/queryStudentInfoByPager.html?pageIndex=${pager.nextPage}">下一页</a>&nbsp;&nbsp;
    				<a href="StudentController/queryStudentInfoByPager.html?pageIndex=${pager.lastPage}">尾页</a>&nbsp;&nbsp;
    			 </c:if>
			</td>   
   		</tr>
    </table>
  </body>
</html>

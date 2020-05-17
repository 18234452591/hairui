<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="charset=utf-8">
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="width: 1200px; margin: 0 auto" align="center">
		<form action="<%=path%>/list.do" method="get">
			根据小区名称查询：<input name="areaName" style="width: 100px"
				value="${areaName }">
			<button type="submit">查询</button>
			<a href="<%=path%>/to-add.do">添加</a>
		</form>
		<table>
			<thead>
				<tr>
					<th>编号</th>
					<th>小区名称</th>
					<th>面积</th>
					<th>租金</th>
					<th>最早入住</th>
					<th colspan="2">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="item">
					<tr>
						<td>${item.id }</td>
						<td>${item.areaName }</td>
						<td>${item.totalArea }</td>
						<td>${item.rentPrice }</td>
						<td>${item.rentDate }</td>
						<td><a onclick="deleteById(${item.id})">删除</a></td>
						<td><a href="<%=path%>/get.do?id=${item.id}">编辑</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>${page }</p>
	</div>
</body>
<script type="text/javascript">
	function page(pageNo) {
		location = "<%=path%>/list.do?pageNo=" + pageNo;
	}
	function deleteById(id){
	    if(confirm("是否确认要删除"+id+"？")){
		   $.get("<%=path%>/delete.do",{id:id},function(obj){
			      if(obj){
					alert("删除成功");
				    location="<%=path%>/list.do";
				  }else{
					  alert("服务器连接失败");
				  }
		   },"json")
	    }
	}
</script>
</html>
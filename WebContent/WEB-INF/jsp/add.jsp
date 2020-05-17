<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div style="width: 800px; margin: 0 auto" align="center">
		<form>
			<p>
				小区名称：<input type="text" name="areaName">
			</p>
			<p>
				面积：<input type="text" name="totalArea">
			</p>
			<p>
				租金：<input type="text" name="rentPrice">
			</p>
			<p>
				最早入住：<input type="date" name="rentDate">
			</p>
			<p>
				<input type="button" onclick="onSubmit()" value="保存">
			</p>
		</form>
	</div>
</body>
<script type="text/javascript">
function onSubmit(){
	var data=$("form").serialize();
	$.post("<%=path%>/add.do",data,function(obj){
		if(obj){
			alert("添加成功");
			location="<%=path%>/list.do";
		}
	},"json")
}
</script>
</html>
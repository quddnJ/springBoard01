<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<h3>Spring Board</h3>
	<table width="500" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>

		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.id }</td>
				<td>${dto.name }</td>
				<td><a href="contentView?id=${dto.id }">${dto.title }</a></td>
				<td>${dto.regdate }</td>
				<td>${dto.hit }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="writeView">글작성</a></td>
		</tr>
	</table>
</body>
</html>
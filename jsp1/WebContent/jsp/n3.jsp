<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>n3.jsp</title>
</head>
<body>
<c:out value="${param.name}" />
<c:out value="${param.age}"/>
<c:out value="${header.name}"/>
<br>
<c:forEach var="item" items="${fixedIncomes }">
	${item.name }<br>
</c:forEach>
</body>
</html>
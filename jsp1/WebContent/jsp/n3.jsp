<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<link href= <c:url value="/css/bootstrap.min.css"/> rel="stylesheet">
<script src=<c:url value="/js/jquery-3.1.0.min.js"/>></script>
<script src= <c:url value="/js/bootstrap.min.js"/>></script>
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
${count }

<h1>你好，世界！</h1>

<button type="button" class="btn btn-primary">Primary</button>

<button type="button" class="btn btn-secondary">Secondary</button>

<button type="button" class="btn btn-success">Success</button>

<button type="button" class="btn btn-info">Info</button>

<button type="button" class="btn btn-warning">Warning</button>

<button type="button" class="btn btn-danger">Danger</button>

<button type="button" class="btn btn-link">Link</button>


</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>n2.jsp</title>
</head>
<body>
<a href="<c:url value="/jsp/n1.jsp"></c:url>">n1.jsp</a>

list的长度是：${fn:length(lsUsers)}
<c:forEach items="${lsUsers}" var="user" >
取值 ${user.phone}
</c:forEach>

count:"${count}"
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div>
    <form action="/ads">
    <label for="search">Search the ads by title or creator.</label>
    <input type="text" id="search" name="search" placeholder="Search here!">
    <button type="submit">Search</button>
    </form>
</div>
<div class="container">
    <h1>Here are all the ads!</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <p>${ad.price}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>

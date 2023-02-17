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
<div class="container">
    <form action="/ads" method="post">
        <div class="form-group">
            <label for="search">Search by Title</label>
            <input type="text" id="search" name="search" placeholder="Search here!">
            <input type="submit" class="btn btn-primary">
        </div>
    </form>

    <h1>Here are all the ads!</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <p>${ad.price}</p>
            <form action="/ads/delete" method="post">
                <input type="hidden" name="ad_id" value="${ad.id}">
                <input class="btn btn-danger btn-sm" type="submit" value="Delete ${ad.title}">
            </form>
        </div>
    </c:forEach>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <jsp:include page="/WEB-INF/ads/create.jsp" />
    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
    </div>
<%--<form action="/ads/create" method="post">--%>
<%--    <div class="mb-3">--%>
<%--        <label for="title" class="form-label">Title</label>--%>
<%--        <input type="title" class="form-control" id="title" placeholder="Name your ad.">--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label for="description" class="form-label">Description</label>--%>
<%--        <textarea class="form-control" id="description" rows="5"></textarea>--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label for="price" class="form-label">Price</label>--%>
<%--        <input type="price" class="form-control" id="price" placeholder="How much?">--%>
<%--    </div>--%>
<%--        <button type="submit" class="btn btn-primary">Place Your Ad</button>--%>
<%--    </form>--%>
</body>
</html>

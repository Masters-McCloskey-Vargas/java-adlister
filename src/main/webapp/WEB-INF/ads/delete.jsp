<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Delete Ad" />
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Delete Ad</h1>
    <form action="/ads/delete" method="post">
        <div class="form-group">
            <h1>Are you sure you would like to delete: "${ad.title}"</h1>
            <input id="delete" name="delete" class="form-control" value="${ad.id}" type="hidden">
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
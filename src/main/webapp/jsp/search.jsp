<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: oians
  Date: 04.01.2021
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Search</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <style>
        body{
            background-image: url("https://redpithemes.com/Documentation/assets/img/page_bg/page_bg_blur02.jpg");
        }
        #searchResult{
            width: 50%;
            padding: 50px;
            margin: 0 auto;
        }
        #searchLogo{
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 150px;
            height: 100px;
        }
    </style>
</head>
<body>

    <div class="text-center">

    </div>
    <img id="searchLogo" src="https://cdn.pixabay.com/photo/2017/03/19/03/48/material-icon-2155442_960_720.png" width="30px" height="30px">

    <div id="searchForm" class="d-flex justify-content-center mt-3">
        <form method="post" class="form-inline" action="${pageContext.request.contextPath}/search">
            <input type="text" name="text" class="form-control mr-1">
            <button id="submitBtn" type="submit" class="btn btn-outline-primary">Search</button>
        </form>
    </div>

    <div class="container">
        <div id="searchResult">

            <c:if test="${requestScope.frequency != null}">
                <p><c:out value="${requestScope.frequency}"/> files exist with this name.</p>
            </c:if>

            <c:forEach var="entry" items="${requestScope.map}">

                <hr>
                <p>
                    This word occurs in this "<c:out value="${entry.key}"/>" file
                    <c:out value="${entry.value}"/> times
                </p>
                <hr>

            </c:forEach>

        </div>
    </div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: jiaji
  Date: 8/12/2021
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${pBook.bookID}"/>
        书籍名称：<input type="text" name="bookName" value="${pBook.bookName}"/>
        书籍数量：<input type="text" name="bookCounts" value="${pBook.bookCounts}"/>
        书籍详情：<input type="text" name="detail" value="${pBook.detail}"/>
        <input type="submit" value="submit"/>
    </form>

</div>
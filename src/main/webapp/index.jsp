<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <title>MyMoney</title>

    <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
    <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>

    <link rel="stylesheet" href="./static/css/style.css">
    <script src="./static/js/script.js"></script>
</head>

<body>

    <div id="mainpage">
        <div id="sidebar">
                <jsp:include page="${sidebar}" />
        </div>

        <div id="content">
                <jsp:include page="${content}" />
        </div>
    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-indigo.css">

    <script src="js/script.js"></script>
</head>

<body>

    <div class="w3-row-padding">
        <!-- Left Column -->
        <div class="w3-container w3-col m3 w3-hide-small">
            <div id="rcolumn">
                <p></p>
            </div>
        </div>

        <!-- Middle Column -->
        <div class="e3-container w3-col m6">
            <div id="content">
                <jsp:include page="${content}" />
            </div>
        </div>

        <!-- Right Column -->
        <div class="w3-container w3-col m3 w3-hide-small">
            <div id="lcolumn">
                <p></p>
            </div>
        </div>
    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<ul>
    <c:forEach var="transaction" items="${transactions}">
        <li>Transaction ${transaction.concept}, (${transaction.date}) for ${transaction.value}</li>
    </c:forEach>
</ul>

<%
    String dataPoints = (String) request.getAttribute("json");
%>

<script>
    var chart = new CanvasJS.Chart("chartContainer", {
        theme: "light1", // "light2", "dark1", "dark2"
        animationEnabled: true,
        zoomEnabled: true,
        title: {
            text: "Try Zooming and Panning"
        },
        data: [{
            type: "line",
            dataPoints: <%out.print(dataPoints);%>
        }]
    });
    chart.render();
</script>

<div id="chartContainer" style="height: 370px; width: 100%;"></div>




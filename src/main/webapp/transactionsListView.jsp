<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<script>
    var chart = new CanvasJS.Chart("chartContainer", {
        theme: "dark1",
        title: {
            text: "Chart"
        },
        animationEnabled: true,
        data: [{
            type: "line",
            dataPoints: ${json}
        }]
    });
    chart.render();
</script>

<div id="chartContainer" style="height: 370px; width: 100%;"></div>

<div class="list">
    <c:forEach var="transaction" items="${transactions}">
        <div class="list-element">
            <span><b>${transaction.concept}</b> ${transaction.value} (${transaction.date}) </span>
        </div>
    </c:forEach>
</div>


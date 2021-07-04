<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<ul>
<c:forEach var="transaction" items="${transactions}">
  <li>Transaction ${transaction.concept}, (${transaction.date}) for ${transaction.value}</li>
</c:forEach>
</ul>



<%--
  Created by IntelliJ IDEA.
  User: Windows
  Date: 14/05/2024
  Time: 2:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>currency transaction</title>
</head>
<body>
<form action="/exchange" method="get">
    <select name="result">
        <option value=" ">select one</option>
        <option value="usd">USD</option>
        <option value="vnd">VND</option>
    </select>
    <input type="number" name="amount" step="0.01">
    <input type="text" readonly value="<c:out value='${currency}'/>">
    <button type="submit">Exchange</button>
</form>
</body>
</html>

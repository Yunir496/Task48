<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Юнир
  Date: 10.08.2023
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>Hello freind!</h2>
<br>
<br>
<form:form action="info" modelAttribute="myCase">
    name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    decription <form:input path="description"/>
    <form:errors path="description"/>
    <br>
    <br>
    priority <form:select path="priority">
    <form:option value="1" label="Низкий"/>
    <form:option value="2" label="Средний"/>
    <form:option value="3" label="Высокий"/>
</form:select>
    <br>
    <br>
    email<form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    <input style="margin-left: 90px" type="submit">
</form:form>

</body>
</html>
<%--<form action="todo/info" method="get">--%>
<%--    <input required type="text" name="todoName" placeholder="Введите название дела">--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <input required type="text" name="description" placeholder="Описание дела">--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <input style="margin-left: 100px" type="submit">--%>
<%--</form>--%>
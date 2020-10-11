<%--
  Created by IntelliJ IDEA.
  User: 15278
  Date: 2020/10/11
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table align="center" border="1">

    <tr height="40" align="center">
        <td colspan="5"><h1>关键词信息列表</h1></td>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
    </tr>
    <tr height="40" align="center">
        <td>编号</td>
        <td>关键词名称</td>
        <td>业务类型</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>

    <c:forEach var="k" items="${lists}">


        <tr height="40" align="center">
            <td>${k.id}</td>
            <td>${k.name}</td>
            <td>${k.type}</td>
            <td>${k.createDate}</td>
            <td><a href="javascript:del(${k.id})">删除</a></td>
        </tr>
    </c:forEach>


</table>


</body>
</html>

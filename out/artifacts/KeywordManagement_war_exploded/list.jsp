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

    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">

        // function ad() {
        // location.href="add.jsp";
        // }
        function del(idd) {
            var flag =confirm("确认删除吗?");
            if (flag == true) {
                location.href="KeywordServlet?id=" +idd+"&comm=del";
            }
        }
        // function setTableColor() {
        //     var tb = document.getElementById("tbl");
        //     // var trs = tb.getElementsByTagName("tr");
        //     for (var i = 0;i < trs.length;i++) {
        //         if (i % 2 == 0) {
        //             trs[i].style.background = "blue";
        //         } else {
        //             trs[i].style.background = "yellow";
        //         }
        //     }
    </script>
</head>
<body>

<table align="center" width="600" border="1" id="tbl">

    <tr height="40" align="center">
        <td colspan="5"><h1>关键词信息列表</h1></td>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
        <%--        <td></td>--%>
    </tr>
    <tr height="40" align="center">
        <td width="100">编号</td>
        <td width="200">关键词名称</td>
        <td width="300">业务类型</td>
        <td width="300">创建时间</td>
        <td width="200">操作</td>
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

<p align="center"><a href="add.jsp"><input type="button" value="添加关键词"></a></p>


</body>
</html>

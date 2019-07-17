<html>
<head>
    <title>hello${name}</title>
</head>
<body>

<table border="1" style="margin: auto" width="300px">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <tbody>
    <#list list as stu>
        <tr>
            <td>${stu.code}</td>
            <td> <a href="/">删除</a> <a href="/">修改</a> </td>
        </tr>
    </#list>
    </tbody>

</table>
<div>
    <p>总共有${pageInfo.pages}页，总共有${pageInfo.total}条记录</p>
    <p>当前是第${pageInfo.pageNum}页</p>
<#--    <c:forEach begin="1" end="${pageInfo.pages}" var="p">
        <a href="/?page=${p}">第${p}页</a>
    </c:forEach>&ndash;&gt;-->
</div>
</body>
</html>
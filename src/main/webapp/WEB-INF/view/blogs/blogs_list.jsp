<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>blogs</title>
</head>
<body>
    <div>
        <table>
            <thead>
                <tr><th>ID</th><th>标题</th><th>内容</th><th>创建者</th><th>最后一次修改人</th><th>创建时间</th><th>最后一次修改时间</th></tr>
            </thead>
            ${blogsList}
            <c:forEach var="blogs" items="${blogsList}" >
            <tr>
                <td>${blogs.ikId}</td>
                <td>${blogs.ikTitle}</td>
                <td>${blogs.ikContent}</td>
                <td>${blogs.ikId}</td>
                <td>${blogs.ikId}</td>
                <td>${blogs.ikId}</td>
                <td>${blogs.ikId}</td>
            </tr>
            </c:forEach>
            <tr></tr>
        </table>
        <br/>
        Jsp脚本：<%=request.getAttribute("blogsList")%><br/>
        EL表达式：${blogsList}
        <br/>
        <table>
            <thead>
                <tr><th>ID</th><th>标题</th><th>内容</th><th>创建者</th><th>最后一次修改人</th><th>创建时间</th><th>最后一次修改时间</th></tr>
            </thead>
            <c:forEach var="i" begin="1" end="5" >
            <tr>
                <td>${i}</td>
                <td>${i}</td>
                <td>${i}</td>
                <td>${i}</td>
                <td>${i}</td>
                <td>${i}</td>
                <td>${i}</td>
            </tr>
            </c:forEach>
            <tr></tr>
        </table>
    </div>
</body>
</html>
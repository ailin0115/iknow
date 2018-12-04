<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<title>Login</title>
</head>
<body>
    <div class="v_form" style="text-align:center">
        <h2>hello!</h2>
        <form action="login" method="post">
	        <table style="margin:auto">
	            <tr>
	                <td>用户名：</td>
	                <td><input type="text" name="username"></td>
	            </tr>
	            <tr>
	                <td>密码：</td>
	                <td><input type="password" name="password"></td>
	            </tr>
	            <tr>
	                <td><input type="submit" value="登录"></td>
	                <td><input type="button" value="取消"></td>
	            </tr>
	        </table>
	        <h2>${msg}</h2>
        </form>
    </div>
	
</body>
</html>
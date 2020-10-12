<%-- 
    Document   : login
    Created on : Oct 10, 2020, 6:59:10 PM
    Author     : 759175
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="./login" method="post">
        <label>Username: </label> <input type="text" name="user" value=""><br>
        <label>Password: </label> <input type="password" name="pass" value=""><br>
        <input type="submit" value="Log in">
        <p>${message}</p>
        </form>
    </body>
</html>

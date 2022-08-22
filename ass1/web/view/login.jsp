<%-- 
    Document   : login
    Created on : Aug 21, 2022, 11:01:11 PM
    Author     : BOT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style = "color: red">${err}</h1>
        <form action="login" method="post">
            <table>
                
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" value = "${username}"></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" value = "${password}"/></td>
                    </tr>
            </table>
            <input type="submit" value="login" /> 

        </form>
        
    </body>
</html>

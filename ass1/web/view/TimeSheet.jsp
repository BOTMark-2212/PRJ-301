<%-- 
    Document   : TimeSheet
    Created on : Aug 22, 2022, 4:35:04 PM
    Author     : BOT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="employee" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>So the</th>
                        <th>Ho va ten</th>
                        <th>Bac luong</th>
                        <th>Vi tri</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listEmployee}" var = "e">
                    <tr>
                        <td>${e.employee_id}</td>
                        <td>${e.name}</td>
                        <td>${e.salary_level_id}</td>
                        <td>${e.posotion_name}</td>
                    </tr>
                </c:forEach>>
                    
                </tbody>
            </table>

        </form>
    </body>
</html>

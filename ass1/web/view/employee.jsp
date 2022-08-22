<%-- 
    Document   : WelcomeLogin
    Created on : Aug 22, 2022, 1:34:02 AM
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
            <select name="opiton">
                <option>Thong tin cong nhan</option>
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
                        <c:forEach items="${requestScope.listEmployee}" var="e">
                            <tr>
                                <td>${e.employee_id}</td>
                                <td>${e.name}</td>
                                <td>${e.salary_level_id}</td>
                                <td>${e.posotion_name}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <option>Bang cham cong</option>
            </select>
        </form>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 2/08/2019, 10:48:41 AM
    Author     : victorpuch
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
            <form:form id="loginForm" modelAttribute="login" action="loginprocess" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="user">Username: </form:label>
                        </td>
                        <td>
                            <form:input path="user" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="pass">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="pass" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                    </tr>
                </table>
            </form:form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
        </body>
        </html>

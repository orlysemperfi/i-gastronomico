<%--
    Document   : head.jsp
    Created on : 19/05/2010, 03:07:05 PM
    Author     : dew-grupo6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/includes.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <c:set var="ctx" value="${pageContext.request.contextPath}"/>
        <title>iGastronomico-Portal</title>
        <style type="text/css">
            @import "${ctx}/css/demo.css";
            @import "${ctx}/css/menu.css";
        </style>
    </head>
    <body onload="document.f.j_username.focus();">
        <div id="page">
            <div id="mainsup">
            </div>
            <div id="mainsubsup">
                <div class="enlaceSimple" style="float: right; width: 80px; margin: 42px 25px 0px 10px">
                    <a href="<c:url value="/listarlocales.htm"/>" >Mis Locales</a>
                </div>
            </div>
            <div id="mainmenu">
                <%@include file="/WEB-INF/jsp/menu.jsp" %>
            </div>
            <div id="maincen">

        <div style="margin: 0pt auto; width: 300px;">
                <h3>Acceso al Sistema</h3>
                <form name='f' action="<c:url value="/j_spring_security_check" />" method='POST'>
                    <table>
                            <tr>
                                <td>Usuario:</td>
                                <td><input type='text' name='j_username' value=''></td>
                            </tr>
                            <tr>
                                <td>Password:</td>
                                <td><input type='password' name='j_password'/></td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <span class="errors">
                                            <c:if test="${not empty param.error}">
                                                ${fn:replace(SPRING_SECURITY_LAST_EXCEPTION.message, 'Bad credentials', 'Usuario o clave incorrectos')}
                                            </c:if>
                                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td><input type='checkbox' name='_spring_security_remember_me'/></td>
                                <td>Recuerdame dentro de esta computadora.</td>
                            </tr>
                            <tr>
                                <td colspan="2" style="padding:0px">
                                    <p class="submit" style="text-align: center">
                                        <input type="submit" value="Login"/>
                                    </p>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <a href="<c:url value="/formusuario.htm?codUsuario=0"/>">Nuevo usuario</a>
                                </td>
                            </tr>
                    </table>
                </form>

<%--                <form:form modelAttribute="usuario" acceptCharset="UTF-8">
                <table>
                    <tr>
                        <td width="100">Login</td>
                        <td>
                            <form:errors path="loginUsuario" cssClass="errors" />
                            <form:input path="loginUsuario" size="20" maxlength="50" />
                        </td>
                    </tr>
                    <tr>
                        <td width="100">Password</td>
                        <td>
                            <form:errors path="claveUsuario" cssClass="errors" />                            
                            <form:password path="claveUsuario" size="20" maxlength="10" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="padding:0px">
                            <p class="submit" style="text-align: center">
                                <input type="submit" value="Login"/>                                
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <a href="<c:url value="/formusuario.htm?codUsuario=0"/>">Nuevo usuario</a>
                        </td>
                    </tr>
                </table>
                </form:form>--%>
        </div>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

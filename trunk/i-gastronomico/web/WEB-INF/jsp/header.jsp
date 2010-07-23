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
	<script type="text/javascript" src="${ctx}/js/jquery/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.core.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.widget.min.js"></script>
        <title>iGastronomico-Portal</title>
        <style type="text/css">
            @import "${ctx}/css/theme/jquery-ui-1.8.2.custom.css";
            @import "${ctx}/css/demo.css";
            @import "${ctx}/css/menu.css";
        </style>   
    </head>
    <body>
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
                
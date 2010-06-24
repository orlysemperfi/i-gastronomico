<%-- 
    Document   : cabecera
    Created on : 06/23/2010, 11:38:40 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />

        <title></title>
    </head>
    <body>
    <div id="wrap">
        <div id="header">
<h1><a href="#">i-Gastronómico</a></h1>
<h2>aventura culinaria virtual</h2>
</div>
<div ><jsp:include page="menu.jsp" flush="true|false"/></div>
</div>
    </body>
</html>

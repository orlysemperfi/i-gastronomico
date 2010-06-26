<%-- 
    Document   : login
    Created on : 06/21/2010, 04:28:22 PM
    Author     : Junior
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<jsp:include page="cabecera.jsp" flush="true|false"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login al sistema</title>
</head>
<body>

<div id="wrap">



<div id="content">

<div class="left">
<h2><a href="#">Login</a></h2>
<p><br />
</p>
</div>
<div style="clear:both;">
<form name="form1" method="post" action="login.do">
<input type="hidden" name="method" value="login"/>
  <p>Usuario:
    <input name="usuario" type="text" id="usuario">
</p>
  <p>Password:
    <input name="password" type="password" id="password">
</p><input type="submit" value="enviar" name="boton"/>
</form>

<bean:write name="mensajeerror" ignore="true" scope="request"/>
</div>

</div>
</body>
</html>

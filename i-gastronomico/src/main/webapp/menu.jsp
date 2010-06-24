<%-- 
    Document   : menu
    Created on : 06/23/2010, 11:38:56 PM
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
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="menu">
<ul>
<li><a href="index.jsp">Iniciooo</a></li>
<li><a href="comentarios.html">Comentarios</a></li>
  <c:if test="${usrLogin.tipo_usuario == 1}">
<li><a href="registro.jsp">Registro</a></li>
  </c:if>
<li><a href="consultas.jsp">Consultas</a></li>
<c:if test="${usrLogin.tipo_usuario == 1}">
<li><a href="LocalAction.do?method=listarLocal">Tours</a></li>
  </c:if>

<li><a href="contactenos.html">Contáctenos</a></li>
<li><a href="login.jsp">login</a></li>
<li><a href="newjsp.jsp">newjsp</a></li>
</ul>
</div>
    </body>
</html>

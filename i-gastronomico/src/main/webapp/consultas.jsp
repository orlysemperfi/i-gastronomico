<%-- 
    Document   : consultas
    Created on : 06/23/2010, 10:44:45 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
<title>i-Gastronůmico : aventura culinaria virtual</title>
<meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />
</head>
<body>

<div id="wrap">



<div id="content">

<div class="left">
<h2><a href="#">Consultas</a></h2>
<p><br />
</p>
</div>
<div style="clear:both;">
  <p>&nbsp;</p>
  <table width="100%" border="0">
    <tr>
      <td align="center" valign="middle"><a href="consulta_restaurante.jsp"><img src="images/consulta_restaurant.jpg" alt="" width="250" height="252" /></a></td>
      <td align="center" valign="middle"><a href="LocalAction3.do?method=listarLocal"><img src="images/consulta_tours.jpg" alt="" width="250" height="226" /></a></td>
    </tr>
    <tr>
      <td align="center" valign="middle"><h2><a href="consulta_restaurante.jsp">RESTAURANTES</a></h2></td>
      <td align="center" valign="middle"><h2><a href="LocalAction3.do?method=listarLocal">TOURS GASTRONOMICOS</a></h2></td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>

</div>

<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

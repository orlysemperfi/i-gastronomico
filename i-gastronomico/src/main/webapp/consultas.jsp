<%-- 
    Document   : consultas
    Created on : 06/23/2010, 10:44:45 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
<title>i-Gastronómico : aventura culinaria virtual</title>
<meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />
</head>
<body>

<div id="wrap">

<div id="header">
<h1><a href="#">i-Gastronómico</a></h1>
<h2>aventura culinaria virtual</h2>
</div>

<div id="menu">
<ul>
<li><a href="index.jsp">Inicio</a></li>
<li><a href="comentarios.html">Comentarios</a></li>
<li><a href="registro.html">Registro</a></li>
<li><a href="consultas.jsp">Consultas</a></li>
<li><a href="tours.html">Tours</a></li>
<li><a href="contactenos.html">Contáctenos</a></li>
</ul>
</div>

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
      <td align="center" valign="middle"><a href="consulta_restaurante.html"><img src="images/consulta_restaurant.jpg" alt="" width="250" height="252" /></a></td>
      <td align="center" valign="middle"><a href="TourAction.do?method=listarTour"><img src="images/consulta_tours.jpg" alt="" width="250" height="226" /></a></td>
    </tr>
    <tr>
      <td align="center" valign="middle"><h2><a href="consulta_restaurante.html">RESTAURANTES</a></h2></td>
      <td align="center" valign="middle"><h2><a href="TourAction.do?method=listarTour">TOURS GASTRONOMICOS</a></h2></td>
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

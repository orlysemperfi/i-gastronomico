<%-- 
    Document   : consulta_tour
    Created on : 06/23/2010, 05:30:17 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
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
<li><a href="index.html">Inicio</a></li>
<li><a href="comentarios.html">Comentarios</a></li>
<li><a href="registro.html">Registro</a></li>
<li><a href="consultas.html">Consultas</a></li>
<li><a href="tours.html">Tours</a></li>
<li><a href="contactenos.html">Contáctenos</a></li>
</ul>
</div>

<div id="content">

<div class="left">
<h2><a href="consultas.html">Consultas</a> : Tours Gastronómicos</h2>
<p><a href="consulta_restaurante.html"><img src="images/consulta_restaurant.jpg" alt="Consultar restaurantes" width="47" height="46" /></a><a href="consulta_tour.html"><img src="images/consulta_tours.jpg" alt="Consultar tours" width="49" height="46" /></a><br />
</p>
</div>
<div style="clear:both;">
  <p>&nbsp;</p>
  <table width="300" border="1">
  <tr>
    <td>Codigo</td>
    <td>
      <p>
        <select name="liCodigosTours" id="liCodigosTours" class="combo" >
          <option value="*">[ TODOS ]</option>
        </select>
      </p>
    </td>
    <td>Nombre</td>
    <td>
      <p>
        <label>
          <input type="text" name="textfield2" id="textfield2" />
        </label>
      </p>
    </td>
    <td>Local</td>
    <td>
      <p>
        <label>
          <input type="text" name="textfield3" id="textfield3" />
        </label>
      </p>
    </td>
  </tr>
  <tr>
    <td colspan="3">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td align="right">
      <p>
        <label>
          <input type="submit" name="Consultar" id="Consultar" value="Consultar" class="BotonComando" />
        </label>
      </p>
    </td>
    </tr>
    <tr>
       <td colspan="6">
           <table>
      <c:forEach var="tour" items="${lstaTab}">
        <tr>
          <td>${tour.cod_tour}</td>
          <td>${tour.nombre_tour}</td>
          <td>${tour.cod_usuario}</td>
        </tr>
      </c:forEach>
    </table>

       </td>
    </tr>
  <tr>
    <td colspan="6">
        <table width="567" border="0">
      <tr>
        <td width="73" bgcolor="#FFA8A8">Codigo Tour</td>
        <td width="79" bgcolor="#FFA8A8">Nombre Tour</td>
        <td width="31" bgcolor="#FFA8A8">Local</td>
        <td width="53" bgcolor="#FFA8A8">Prioridad</td>
        <td width="70" bgcolor="#FFA8A8">Comentario</td>
        <td width="134" bgcolor="#FFA8A8">Flag_Compartir</td>
        </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        </tr>
      </table></td>
  </tr>
</table>

</div>

</div>

<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

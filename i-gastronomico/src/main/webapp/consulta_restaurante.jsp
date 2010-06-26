<%-- 
    Document   : consulta_restaurante
    Created on : 06/25/2010, 09:00:15 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="cabecera.jsp" flush="true|false"/>
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



<div id="content">

<div class="left">
<h2><a href="consultas.jsp">Consultas</a> : Restaurantes</h2>
<p><a href="consulta_restaurante.jsp"><img src="images/consulta_restaurant.jpg" alt="Consultar restaurantes" width="47" height="46" /></a><a href="consulta_tour.html"><img src="images/consulta_tours.jpg" alt="Consultar tours" width="49" height="46" /></a><br />
</p>
</div>
<div style="clear:both;">
  <p>&nbsp;</p>
  <table width="100%" border="0">
    <tr>
      <td colspan="2">Departamento
        <label>
          <select name="liDepartamento" id="liDepartamento" class="combo">
            <option value="*">[ TODOS ]</option>
          </select>
        </label></td>
      <td colspan="2">Provincia
        <label>
          <select name="liProvincia" id="liProvincia" class="combo">
            <option value="*">[ TODOS ]</option>
          </select>
        </label></td>
      <td colspan="3">Distrito
        <label>
          <select name="liDistrito" id="liDistrito" class="combo">
            <option value="*">[ TODOS ]</option>
            </select>
        </label></td>
      </tr>
    <tr>
      <td width="14%">Categoría Platos</td>
      <td colspan="6"><label>
        <input name="chkCriollo" type="checkbox" id="chkCriollo" checked="checked" />
        Criollo
        <input name="chkMarino" type="checkbox" id="chkMarino" checked="checked" />
        Marino
        <input name="chkPastas" type="checkbox" id="chkPastas" checked="checked" />
        Pastas
        <input name="chkCarnesParrillas" type="checkbox" id="chkCarnesParrillas" checked="checked" />
        Carnes y Parrillas
        <input name="chkVegetariano" type="checkbox" id="chkVegetariano" checked="checked" />
        Vegetariano</label></td>
      </tr>
    <tr>
      <td>Costos</td>
      <td width="24%"><label>
        <input name="chkBajo" type="checkbox" id="chkBajo" checked="checked" />
        Bajo
        <input name="chkMedio" type="checkbox" id="chkMedio" checked="checked" />
        Medio
        <input name="chkAlto" type="checkbox" id="chkAlto" checked="checked" />
        Alto</label></td>
      <td width="22%">Sólo los que incluyen promociones</td>
      <td colspan="3"><input type="checkbox" name="chkIncluyePromocion" id="chkIncluyePromocion" /></td>
      <td width="18%" align="right">
          <input type="submit" name="btnConsultarRestaurante" id="btnConsultarRestaurante" value="Consultar" class="BotonComando"/></td>
    </tr>
  </table>
  <table width="100%" border="0">
    <tr>
      <td bgcolor="#FFA8A8">Restaurant</td>
      <td bgcolor="#FFA8A8">Ubicación</td>
      <td bgcolor="#FFA8A8">Teléfonos</td>
      <td bgcolor="#FFA8A8">Web</td>
      <td bgcolor="#FFA8A8">Contacto</td>
      <td bgcolor="#FFA8A8">Menu / Promocion </td>
      <td bgcolor="#FFA8A8">Calificación</td>
      <td bgcolor="#FFA8A8">&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
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
      <td>&nbsp;</td>
      <td>&nbsp;</td>
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

<%-- 
    Document   : consulta_tour
    Created on : 06/23/2010, 05:30:17 PM
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
<h2><a href="consultas.jsp">Consultas</a> : Tours Gastronómicos</h2>
<p><a href="consulta_restaurante.jsp"><img src="images/consulta_restaurant.jpg" alt="Consultar restaurantes" width="47" height="46" /></a><a href="consulta_tour.html"><img src="images/consulta_tours.jpg" alt="Consultar tours" width="49" height="46" /></a><br />
</p>
</div>
<div style="clear:both;">
  <p>&nbsp;</p>
  <form name="form1" method="post" action="consultaTour.do">
            <input type="hidden" name="method" value="ConsultarTour"/>
  <table width="300" border="1">
  <tr>
    <td>Codigo</td>
    <td>
      <p>
        <label>
          <input type="text" name="cod_tour" id="cod_tour" />
        </label>
      </p>
    </td>
    <td>Nombre</td>
    <td>
      <p>
        <label>
          <input type="text" name="nombre_tour" id="nombre_tour" />
        </label>
      </p>
    </td>
    <td>Local</td>
    <td>
      <p>
        <label>
          <html:select property="cod_local" name="blocal" styleClass="combo">
                                       <html:options collection="lstaCmbo" labelProperty="razon_social" property="cod_local"/>
                               </html:select>
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
          <input type="submit" name="boton"  value="enviar" class="BotonComando" />
        </label>
      </p>
    </td>
    </tr>
    <tr>
       <td colspan="6">
           <table width="567" border="0">
               <tr>
        <td width="73" bgcolor="#FFA8A8">Codigo Tour</td>
        <td width="79" bgcolor="#FFA8A8">Nombre Tour</td>
        <td width="79" bgcolor="#FFA8A8">USUARIO</td>
        <td width="31" bgcolor="#FFA8A8">Local</td>
        <td width="53" bgcolor="#FFA8A8">Prioridad</td>
        <td width="70" bgcolor="#FFA8A8">Comentario</td>
        <td width="134" bgcolor="#FFA8A8">Flag_Compartir</td>
        </tr>
      <c:forEach var="tour" items="${lstaTab}">
        <tr>
          <td>${tour.cod_tour}</td>
          <td>${tour.nombre_tour}</td>
          <td>${tour.cod_usuario}</td>
          <td>${tour.cod_local}</td>
          <td>${tour.prioridad}</td>
          <td>${tour.comentario}</td>
          <td>${tour.flag_comparte_tour}</td>
          
        </tr>
      </c:forEach>
    </table>
          

       </td>
    </tr>
 
</table>
 </form>
</div>

</div>

<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

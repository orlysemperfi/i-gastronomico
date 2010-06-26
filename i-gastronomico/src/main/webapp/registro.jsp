<%-- 
    Document   : registro
    Created on : 06/24/2010, 12:25:19 AM
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
<title>i-Gastron�mico : aventura culinaria virtual</title>
<meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />


</head>
<body>

<div id="wrap">



<div id="content"></div>
<div style="clear:both;">

    <form name="form1" method="post" action="RestRegistra.do">
            <input type="hidden" name="method" value="registraRest"/>
  <table>
      <tr>
          <td><b>Registro de Restaurantes</b></td>
      </tr>
      <tr>
          <td>
              <fieldset>
                  <legend><b>Datos Principales</b></legend>
                  <table>
                      <tr>
                          <td>Codigo:</td>
                          <td><input type="text" name="cod_local" id="cod_local" size="50"></input> </td
                          ><td>Raz�n Social:</td>
                          <td><input type="text" name="razon_social" id="razon_social" size="50"></input> </td>
                         
                      </tr>
                      <tr>
                          <td>Escriba un Comentario:</td>
                      </tr>
                      <tr>
                          <td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;
                              <textarea name="comentario_perfil" id="comentario_perfil" rows="4" cols="70"></textarea>
                          </td>
                      </tr>
                  </table>
              </fieldset>
              <fieldset>
                  <legend><b>Ubicaci�n</b></legend>
                  <table>
                      <tr>
                          <td>Direcci�n:</td>
                          <td><input type="text" name="direccion" id="direccion" size="20"></input> </td>
                          <td>Referencia:</td>
                          <td><input type="text" name="referencia" id="referencia"size="20"></input> </td>
                      </tr>
                      <tr>
                          <td>Departamento:</td>
                          <td>
                              <select name="departamento" id="departamento" class="combo">
                                 <option value="">[ Seleccione ]</option>
                                 <option value="D0001"> Lima </option>
                                <option value="D0002"> Arequipa </option>
                             <option value="D0003"> Cuzco </option>
                            </select>
                          </td>
                          <td>Provincia:</td>
                          <td>
                             <select name="provincia" id="provincia" class="combo">
                                 <option value="">[ Seleccione ]</option>
                                 <option value="P0001"> Lima </option>
                                <option value="P0002"> Arequipa </option>
                             <option value="P0003"> Cuzco </option>
                            </select>
                          </td>
                          <td>Distrito:</td>
                          <td>
                              <select name="distrito" id="distrito" class="combo">
                                 <option value="D0001">[ Seleccione ]</option>
                                 <option value="D0002"> Jesus Mar�a </option>
                                 <option value="D0003"> Surco </option>
                            </select>
                          </td>
                      </tr>
                  </table>
              </fieldset>
              <fieldset>
                  <legend><b>Contactenos</b></legend>
                  <table>
                      <tr>
                          <td>Persona de Contacto:</td>
                          <td><input type="text" name="persona_de_contacto" ID="persona_de_contacto" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Telefono:</td>
                          <td><input type="text" name="telefonos" id="telefonos" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Correo:</td>
                          <td><input type="text" name="correo" id="correo" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Web Site:</td>
                          <td><input type="text" name="web" id="web" size="50"></input> </td>
                      </tr>
                  </table>
              </fieldset>
              <fieldset>
                  <legend><b>Datos Adicionales</b></legend>
                  <table>
                      <tr>
                          <td>Categoria de Platos:</td>
                      </tr>
                      <tr>
                          <td>
                               <input name="categoria_platos" type="checkbox" id="categoria_platos" checked="checked" />
                                Criollo
                                <input name="chkMarino" type="checkbox" id="chkMarino" checked="checked" />
                                Marino
                                <input name="chkPastas" type="checkbox" id="chkPastas" checked="checked" />
                                Pastas
                                <input name="chkCarnesParrillas" type="checkbox" id="chkCarnesParrillas" checked="checked" />
                                Carnes y Parrillas
                                <input name="chkVegetariano" type="checkbox" id="chkVegetariano" checked="checked" />
                                Vegetariano
                          </td>
                      </tr>
                      <tr>
                          <td>Categoria de Costos :</td>
                      </tr>
                      <tr>
                          <td>
                              <input name="categoria_costo"  id="categoria_costo" type="radio" id="chkBajo" />
                                Bajo
                                <input name="rd_costo" type="radio" id="chkMedio" />
                                Medio
                                <input name="rd_costo" type="radio" id="chkAlto" />
                                Alto
                          </td>
                      </tr>
                      <tr>
                          <td>Promociones : <input type="text" name="promocion_actual" id="promocion_actual" size="50"></td>
                      </tr>
                      <tr>
                          <td>Carta Actual : <input type="text" name="carta_actual" id="carta_actual" size="50"></td>
                      </tr>
                      <tr>
                          <td>Subir Foto del Restaurant : <input name="foto_ubicacion" id="foto_ubicacion" type="file"></td>
                      </tr>
                      <tr>
                          <td>Subir Croquis del Restaurant : <input name="foto_local" id="foto_local" type="file" ></td>
                      </tr>
                  </table>
              </fieldset>
          </td>
      </tr>
      <tr>
          <td>
              <p>
              <label>
                <input type="submit" value="enviar" name="boton" class="BotonComando"/>
              </label>
              <input type="button" name="btnCancelar" id="btnCancelar" value="Cancelar" onClick="Cancelar()" class="BotonComando" />
            </p>
          </td>
          <td>
            <p>&nbsp;</p>
          </td>
        </tr>
  </table>
            <table width="567" border="0">
               <tr>
        <td width="73" bgcolor="#FFA8A8">Codigo Local</td>
        <td width="79" bgcolor="#FFA8A8">Razon Social</td>
        <td width="79" bgcolor="#FFA8A8">Departamento</td>
        <td width="31" bgcolor="#FFA8A8">Provincia</td>
        <td width="53" bgcolor="#FFA8A8">Distrito</td>
        <td width="70" bgcolor="#FFA8A8">Direecion</td>
         <td width="134" bgcolor="#FFA8A8">Modificar</td>
        <td width="134" bgcolor="#FFA8A8">Eliminar</td>
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
          <td><a href="Carga.do?method=cargaDatos&cod_tour=<c:out value="${tour.cod_tour}"/>">   <img alt="actualizar" src="images/act.jpg" width="18" height="18" border="0">
</a></td>
          <td><a href="elimina.do?method=eliminar&cod_tour=<c:out value="${tour.cod_tour}"/>">   <img alt="eliminar" src="images/eli.jpg" width="18" height="18" border="0">
</a></td>

        </tr>
      </c:forEach>
    </table>
              </form>
</div>
<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

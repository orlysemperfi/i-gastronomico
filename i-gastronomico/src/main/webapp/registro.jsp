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
<title>i-Gastronómico : aventura culinaria virtual</title>
<meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />


</head>
<body>

<div id="wrap">



<div id="content"></div>
<div style="clear:both;">
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
                          <td>Razón Social:</td>
                          <td><input type="text" name="txt_razonsocial" size="50"></input> </td>
                          <td>Nº RUC:</td>
                          <td><input type="text" name="txt_nroruc" maxlength="11" onKeyPress = "ValidarEntero(this, false)" onBlur = "ValidarEntero(this, true)"></input> </td>
                      </tr>
                      <tr>
                          <td>Escriba un Comentario:</td>
                      </tr>
                      <tr>
                          <td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;
                              <textarea name="obsv" id="obsv" rows="4" cols="70"></textarea>
                          </td>
                      </tr>
                  </table>
              </fieldset>
              <fieldset>
                  <legend><b>Ubicación</b></legend>
                  <table>
                      <tr>
                          <td>Dirección:</td>
                          <td><input type="text" name="txt_direccion" size="20"></input> </td>
                          <td>Referencia:</td>
                          <td><input type="text" name="txt_referencia" size="20"></input> </td>
                      </tr>
                      <tr>
                          <td>Departamento:</td>
                          <td>
                              <select name="liDepartamento" id="liDepartamento" class="combo">
                                 <option value="">[ Seleccione ]</option>
                                 <option value=""> Lima </option>
                            </select>
                          </td>
                          <td>Provincia:</td>
                          <td>
                             <select name="liProvincia" id="liDepartamento" class="combo">
                                 <option value="">[ Seleccione ]</option>
                                 <option value=""> Lima </option>
                            </select>
                          </td>
                          <td>Distrito:</td>
                          <td>
                              <select name="liDistrito:" id="liDistrito:" class="combo">
                                 <option value="">[ Seleccione ]</option>
                                 <option value=""> Jesus María </option>
                                 <option value=""> Surco </option>
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
                          <td><input type="text" name="txt_percontacto" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Telefono:</td>
                          <td><input type="text" name="txt_telefono" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Correo:</td>
                          <td><input type="text" name="txt_correo" size="50"></input> </td>
                      </tr>
                      <tr>
                          <td>Web Site:</td>
                          <td><input type="text" name="txt_website" size="50"></input> </td>
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
                               <input name="chkCriollo" type="checkbox" id="chkCriollo" checked="checked" />
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
                                <input name="rd_costo" type="radio" id="chkBajo" />
                                Bajo
                                <input name="rd_costo" type="radio" id="chkMedio" />
                                Medio
                                <input name="rd_costo" type="radio" id="chkAlto" />
                                Alto
                          </td>
                      </tr>
                      <tr>
                          <td>Promociones : <input type="text" name="txt_promociones" size="50"></td>
                      </tr>
                      <tr>
                          <td>Carta Actual : <input type="text" name="txt_carta_actual" size="50"></td>
                      </tr>
                      <tr>
                          <td>Subir Foto del Restaurant : <input name="uparchivo" type="file"></td>
                      </tr>
                      <tr>
                          <td>Subir Croquis del Restaurant : <input name="uparchivo" type="file" ></td>
                      </tr>
                  </table>
              </fieldset>
          </td>
      </tr>
  </table>
</div>
<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

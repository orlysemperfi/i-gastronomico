<%-- 
    Document   : modificaTour
    Created on : 06/25/2010, 04:17:52 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">

        <title>i-Gastronómico : aventura culinaria virtual</title>
        <meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />

    </head>
    <body>
        <div id="wrap">

<div id="content"><div class="left">
<h2><a href="#">Modifica Tours</a></h2>
<p><br />
</p>
</div>
<div style="clear:both;">
       
        <html:form action="tour-mod">
    <input type="hidden" name="method" value="modificar" />
    <input type="hidden" name="cod_tour" value='<bean:write property="cod_tour" name="usrEdit" />' />
    <table>

        <tr>
            <td>Nombre</td>
            <td><html:text property="nombre_tour" name="usrEdit" /></td>
            <td>&nbsp;<font color="red"><html:errors property="nombre_tour" header="empty"/></font></td>
        </tr>

        <tr>
            <td>Local</td>
            <td>
                <html:select property="cod_local" name="usrEdit">
                    <html:options collection="lstaCmbo" labelProperty="razon_social" property="cod_local"/>
                </html:select>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>prioridad</td>
            <td><html:text property="prioridad"  name="usrEdit" /></td>
            <td>&nbsp;<font color="red"><html:errors property="prioridad" header="empty"/></font></td>
        </tr>
        <tr>
            <td>comentario</td>
            <td><html:textarea property="comentario"  name="usrEdit" /></td>
            <td>&nbsp;<font color="red"><html:errors property="comentario" header="empty"/></font></td>
        </tr>

        <tr>
            <td>comentario</td>
            <td><html:checkbox property="flag_comparte_tour"  name="usrEdit" /></td>
            <td>&nbsp;<font color="red"><html:errors property="flag_comparte_tour" header="empty"/></font></td>
        </tr>
        
        <tr>
            <td colspan="3">
                <html:submit styleClass="btn">Grabar</html:submit>
                <input type="button" class="btn" value="Cancelar" onclick="javascript:cancelaModif();" />
            </td>
        </tr>
    </table>
</html:form>
    </div>
</div>
        </div>
    </body>
</html>

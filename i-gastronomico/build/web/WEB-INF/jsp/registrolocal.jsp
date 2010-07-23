<%@include file="/WEB-INF/jsp/header.jsp" %>
<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.mouse.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.draggable.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.position.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery/ui/jquery.ui.dialog.min.js"></script>
<script type="text/javascript">
function verDialogo(){
        $("#mapDialog").dialog({width:"460px",modal: true});
}
</script>
<div>
<h2>Local</h2>
<div class="submit">
    <a href="#" onclick="verDialogo()">Ver Mapa de Ubicacion<img src="images/toolbar/add.gif" align='absmiddle' class="search_image" /></a>
</div>
<form:form modelAttribute="local" enctype="multipart/form-data" acceptCharset="UTF-8">
<table>
    <tr>
        <td>
            <form:hidden path="codLocal" />
            <br/>            
        </td>
        <td rowspan="8" valign="top">
            <img src="<c:url value="/obtienefotolocal.htm"/>" />
        </td>
    </tr>
    <tr>
        <td>
            Razon Social: <form:errors path="razonSocial" cssClass="errors" />
            *<br/>
            <form:input path="razonSocial" size="50" maxlength="100" />
        </td>
    </tr>
    <tr>
        <td>
            Departamento: <form:errors path="departamento" cssClass="errors" />
            *<br/>
            <form:input path="departamento" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Provincia: <form:errors path="provincia" cssClass="errors" />
            *<br/>
            <form:input path="provincia" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Distrito: <form:errors path="distrito" cssClass="errors" />
            *<br/>
            <form:input path="distrito" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Dirección: <form:errors path="direccion" cssClass="errors" />
            *<br/>
            <form:input path="direccion" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Referencia: <form:errors path="referencia" cssClass="errors" />
            *<br/>
            <form:input path="referencia" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Persona de Contacto: <form:errors path="personaDeContacto" cssClass="errors" />
            *<br/>
            <form:input path="personaDeContacto" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Teléfonos: <form:errors path="telefonos" cssClass="errors" />
            *<br/>
            <form:input path="telefonos" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Email: <form:errors path="correo" cssClass="errors" />
            *<br/>
            <form:input path="correo" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Sitio Web: <form:errors path="web" cssClass="errors" />
            <br/>
            <form:input path="web" size="30" maxlength="30" />
        </td>
    </tr>
    <tr>
        <td>
            Categoria de plato:<form:errors path="categoriaPlato" cssClass="errors" />
            <br/>
            <form:select path="categoriaPlato" items="${categoriaPlatoList}" itemValue="idcategoriaPlato" itemLabel="categoriaPlato" />
        </td>
    </tr>
    <tr>
        <td>
            Categoria de costo:<form:errors path="categoriaCosto" cssClass="errors" />
            <br/>
            <form:select path="categoriaCosto" items="${categoriaCostoList}" itemValue="idcategoriaCosto" itemLabel="categoriaCosto" />
        </td>
    </tr>
    <tr>
        <td>
            Comentario: <form:errors path="comentarioPerfil" cssClass="errors" />
            <br/>
            <form:textarea path="comentarioPerfil" cols="45" />
        </td>
    </tr>
    <tr>
        <td>
            Carta Actual: <form:errors path="cartaActual" cssClass="errors" />
            <br/>
            <form:textarea path="cartaActual" cols="45" />
        </td>
    </tr>
    <tr>
        <td>
            Promocion: <form:errors path="promocionActual" cssClass="errors" />
            <br/>
            <form:textarea path="promocionActual" cols="45" />
        </td>
    </tr>
    <tr>
        <td>
             Foto del Local
            <br/>
            <input type="file" name="fotoLocal" id="fotoLocal" size="50">
        </td>
    </tr>
    <tr>
        <td>
            Foto de la ubicacion
            <br/>
            <input type="file" name="fotoUbicacion" id="fotoUbicacion" size="50">
        </td>
    </tr>
    <tr>
        <td colspan="2" style="padding:0px">
            <p class="submit">
                <input type="submit" value="Guardar" id="guardar"/>
            </p>
        </td>
    </tr>
</table>
</form:form>
</div>
<div id="mapDialog" title="Mapa" style="width: 600px; height: 400px; display: none">
    <iframe width="425" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=es&amp;geocode=&amp;q=lima&amp;sll=37.0625,-95.677068&amp;sspn=45.957536,93.076172&amp;ie=UTF8&amp;hq=&amp;hnear=Lima,+Santa+Mar%C3%ADa+del+Mar,+Lima,+Per%C3%BA&amp;ll=-12.043333,-77.028333&amp;spn=0.01725,0.028903&amp;z=14&amp;output=embed"></iframe><br /><small><a href="http://maps.google.com/maps?f=q&amp;source=embed&amp;hl=es&amp;geocode=&amp;q=lima&amp;sll=37.0625,-95.677068&amp;sspn=45.957536,93.076172&amp;ie=UTF8&amp;hq=&amp;hnear=Lima,+Santa+Mar%C3%ADa+del+Mar,+Lima,+Per%C3%BA&amp;ll=-12.043333,-77.028333&amp;spn=0.01725,0.028903&amp;z=14" style="color:#0000FF;text-align:left">Ver mapa más grande</a></small>
</div>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

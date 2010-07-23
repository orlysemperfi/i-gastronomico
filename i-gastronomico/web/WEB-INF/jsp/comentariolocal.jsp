<%@include file="/WEB-INF/jsp/header.jsp" %>
<h2>${local.razonSocial}</h2>
<table>
    <tr>
        <td valign="top">
<table>
    <tr>
        <td>
            <b>Departamento</b>
        </td>
        <td>
            ${local.departamento}
        </td>
    </tr>
    <tr>
        <td>
            <b>Provincia</b>
        </td>
        <td>
            ${local.provincia}
        </td>
    </tr>
    <tr>
        <td>
            <b>Distrito</b>
        </td>
        <td>
            <b>${local.distrito}</b>
        </td>
    </tr>
    <tr>
        <td>
            <b>Dirección</b>
        </td>
        <td>
            ${local.direccion}
        </td>
    </tr>
    <tr>
        <td>
            <b>Persona de contacto</b>
        </td>
        <td>
            ${local.personaDeContacto}
        </td>
    </tr>
    <tr>
        <td>
            <b>Telefono</b>
        </td>
        <td>
            ${local.telefonos}
        </td>
    </tr>
    <tr>
        <td>
            <b>Correo</b>
        </td>
        <td>
            ${local.correo}
        </td>
    </tr>
    <tr>
        <td>
            <b>web</b>
        </td>
        <td>
            ${local.web}
        </td>
    </tr>
<%--    <tr>
        <td colspan="2">
             <form action="<c:url value="/editaralumno.htm"/>">
                <input type="hidden" name="idalumno" value="${alumno.idalumno}" />
                <p class="submit"><input type="submit" value="Editar Alumno" /></p>
             </form>            
        </td>
    </tr>
--%>
</table>
</td>
<td>
    <img src="<c:url value="/obtienefotolocal.htm"/>" />
</td>
</tr>
</table>

<h3>Comentarios:</h3>
<table width="100%" border="1">
    <tbody>
    <c:forEach var="comentario" items="${local.comentarios}">
    <tr>
        <td style="background: #fff; width:100px" align="center">
            <img src="<c:url value="/obtienefotousuario.htm?codUsuario=${comentario.usuario.codUsuario}"/>" height="55" width="45" />
            <br/>
            <span style="font-size: 10px">${comentario.usuario.nombreUsuario}</span>
        </td>
        <td style="background: #fafafa">
            <div>
                ${comentario.comentario}
            </div>
        </td>
    </tr>
    </c:forEach>
    <tr>
        <td style="background: #F6F9ED">
            <img src="<c:url value="/obtienefotousuario.htm"/>" height="55" width="45" />
            <br/>
            <b style="font-style: italic">${usuario.nombreUsuario}</b>
        </td>
        <td style="background: #F6F9ED" colspan="2">
            <div><h3>Enviar un Comentario Nuevo</h3> </div>
            <div>
                <form action="<c:url value="/comentariolocal.htm"/>" method="post">                    
                    <textarea name="comentario" id="comentario" cols="45" rows="5" ></textarea>
                    <p class="submit">
                        <input type="submit" value="Comentar" />
                    </p>
                 </form>
            </div>
        </td>
   </tr>
    </tbody>
</table>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

<%@include file="/WEB-INF/jsp/header.jsp" %>
<div>
<h2>Usuario</h2>
<form:form modelAttribute="usuario" enctype="multipart/form-data" acceptCharset="UTF-8">
<table>
    <tr>
        <td>
            <form:hidden path="codUsuario" />
            <br/>
            <img src="<c:url value="/obtienefotousuario.htm"/>" height="100" width="100" />
        </td>
    </tr>
    <tr>
        <td>
            Nombre: <form:errors path="nombreUsuario" cssClass="errors" />
            <br/>
            <form:input path="nombreUsuario" size="50" maxlength="100" />
        </td>
    </tr>
    <tr>
        <td>
            Login: <form:errors path="loginUsuario" cssClass="errors" />
            <br/>
            <form:input path="loginUsuario" size="10" maxlength="20" />
        </td>
    </tr>
    <tr>
        <td>
            Clave: <form:errors path="claveUsuario" cssClass="errors" />
            <br/>
            <form:password path="claveUsuario" size="10" maxlength="20" />
        </td>
    </tr>
    <tr>
        <td>
            Tipo de usuario:<form:errors path="tipoUsuario" cssClass="errors" />
            <br/>
            <form:select path="tipoUsuario" items="${tipoUsuarioList}" itemValue="idtipoUsuario" itemLabel="tipoUsuario" />
        </td>
    </tr>
    <tr>
        <td>
            Fecha de Registro:<form:errors path="fechaRegistro" cssClass="errors" />
            <br/>
            <form:input path="fechaRegistro" size="10" maxlength="10" readonly="true" />(yyyy-mm-dd)
        </td>
    </tr>
    <tr>
        Foto
        <br/>
        <td>
            <input type="file" name="fotoUsuario" id="fotoUsuario" size="50">
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
<div>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

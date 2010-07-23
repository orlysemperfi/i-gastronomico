<%@include file="/WEB-INF/jsp/header.jsp" %>
<div>
<h2>Tour</h2>
<form:form modelAttribute="tour">
<table>
    <tr>
        <td>
            <form:hidden path="idtour" />
            <br/>
        </td>
    </tr>
    <tr>
        <td>
            Nombre de Tour: <form:errors path="codTour" cssClass="errors" />
            *<br/>
            <form:input path="codTour" size="50" maxlength="100" />
        </td>
    </tr>
    <tr>
        <td>
            Observacion: <form:errors path="comentario" cssClass="errors" />
            <br/>
            <form:textarea path="comentario" cols="38"/>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <form:errors cssClass="errors"/>
        </td>
    </tr>
    <tr>
        <td colspan="2" style="padding:0px">
            <p class="submit">
                <input type="submit" value="Agregar Locales a Visitar" id="guardar"/>
            </p>
        </td>
    </tr>
</table>
</form:form>

<br/>

<h3>Lista de locales a visitar</h3>
<table>
    <thead>
        <tr>
            <th>Razon social</th>
            <th>Departamento</th>
            <th>Provincia</th>
            <th>Distrito</th>            
            <th></th>
            <th></th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="local" items="${tour.locals}">
        <tr>
            <td>
                <a href="<c:url value="/registrolocal.htm?codLocal=${local.codLocal}"/>">${local.razonSocial}</a>
            </td>
            <td>
                ${local.departamento}
            </td>
            <td>
                ${local.provincia}
            </td>
            <td>
                ${local.distrito}
            </td>
            <td>
                <a href="<c:url value="/comentariolocal.htm?codLocal=${local.codLocal}"/>">ver Comentarios</a>
            </td>
            <td>
                <a href="<c:url value="/eliminarlocal.htm?codLocal=${local.codLocal}"/>" style="text-decoration: none; color:red; font-weight: bold">X</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
         <tr>
            <td colspan="3">
                <form action="<c:url value="/registrotour.htm"/>" method="post">
                    <input type="hidden" name="idtour" value="1"/>
                    <input type="hidden" name="codUsuario" value="${usuario.codUsuario}" />
                    <p class="submit"><input type="submit" value="Guardar Tour" class="submit" /></p>
                 </form>
            </td>
            <td colspan="4"></td>
        </tr>
    </tfoot>
</table>                    
<div>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

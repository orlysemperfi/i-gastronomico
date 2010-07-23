<%@include file="/WEB-INF/jsp/header.jsp" %>
<h2>Lista de locales</h2>
<table>
    <thead>
        <tr>
            <th>Razon social</th>
            <th>Departamento</th>
            <th>Provincia</th>
            <th>Distrito</th>
            <th>Dueño</th>
            <th></th>
            <th></th>
        </tr>
    </thead>    
    <c:forEach var="local" items="${localList}">
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
                ${local.usuario.nombreUsuario}
            </td>
            <td>
                <a href="<c:url value="/comentariolocal.htm?codLocal=${local.codLocal}"/>">ver Comentarios</a>
            </td>
            <td>
                <a href="#"  title="ELIMINAR" style="text-decoration: none; color:red; font-weight: bold">X</a>
            </td>    
        </tr>
    </c:forEach>    
</table>
<div class="submit">
    <a href="<c:url value="/registrolocal.htm?codLocal=0"/>">Nuevo Local<img src="images/toolbar/add.gif" align='absmiddle' class="search_image" /></a>
    <a href="<c:url value="/listarlocales.htm?all=true"/>">Mostrar todos los locales<img src="images/toolbar/bullet-arrow.gif" align='absmiddle' class="search_image" /></a>
</div>
<%@include  file="/WEB-INF/jsp/footer.jsp" %>
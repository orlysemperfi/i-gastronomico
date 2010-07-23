<%@include file="/WEB-INF/jsp/header.jsp" %>

<table>
    <thead>
        <tr>
            <th>Nombres</th>
            <th></th>
        </tr>
    </thead>    
    <c:forEach var="usuario" items="${usuarioList}">
        <tr>
            <td>
                <a href="<c:url value="/formusuario.htm?codUsuario=${usuario.codUsuario}"/>">${usuario.nombreUsuario}</a>
            </td>
        </tr>
    </c:forEach>    
</table>
<%@include  file="/WEB-INF/jsp/footer.jsp" %>
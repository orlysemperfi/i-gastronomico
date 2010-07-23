<%@include file="/WEB-INF/jsp/header.jsp" %>
<h2>Lista de tours</h2>
<table>
    <thead>
        <tr>
            <th>Identificacion</th>            
            <th></th>
        </tr>
    </thead>    
    <c:forEach var="tour" items="${tourList}">
        <tr>
            <td>
                <a href="<c:url value="/registrotour.htm?idtour=${tour.idtour}"/>">${tour.codTour}</a>
            </td>
            <td>
                ${tour.comentario}
            </td>
            <td>
                <a href="#" title="Eliminar" style="text-decoration: none; color:red; font-weight: bold">X</a>
            </td>    
        </tr>
    </c:forEach>    
</table>
<div class="submit">
    <a href="<c:url value="/registrotour.htm?idtour=0"/>">Crear Nuevo Tour<img src="images/toolbar/add.gif" align='absmiddle' class="search_image" /></a>
    <a href="<c:url value="/listartour.htm"/>">Refrescar Listado<img src="images/toolbar/bullet-arrow.gif" align='absmiddle' class="search_image" /></a>
</div>
<%@include  file="/WEB-INF/jsp/footer.jsp" %>
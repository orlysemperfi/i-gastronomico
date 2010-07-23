<%@include file="/WEB-INF/jsp/header.jsp" %>
<h2>Busqueda de locales</h2>

<form:form modelAttribute="local">
  <table>
    <tr>
        <th>
            Razon Social: <form:errors path="razonSocial" cssClass="errors" />
        </th>
        <th>
            <form:input path="razonSocial" size="50" maxlength="100" />
        </th>
        <th rowspan="4">
            <span>Categoria de plato</span>
            <div class="divlitle">
                <c:forEach var="categoriaPlato" items="${categoriaPlatoList}" >
                    <form:checkbox path="categoriaPlato" value="${categoriaPlato}" label="${categoriaPlato}" />
                    <br/>
                </c:forEach>
                <%--<form:checkboxes path="categoriaPlato" items="${categoriaPlatoList}"/>--%>
            </div>
        </th>
        <th rowspan="4">
            <span>Categoria de costo</span>
            <div class="divlitle">
                <c:forEach var="categoriaCosto" items="${categoriaCostoList}">
                    <form:checkbox path="categoriaCosto" value="${categoriaCosto}" label="${categoriaCosto}" />
                    <br/>
                </c:forEach>
                <%--<form:checkboxes path="categoriaCosto" items="${categoriaCostoList}"/>--%>
            </div>
        </th>

    </tr>
    <tr>
        <th>
            Departamento: <form:errors path="departamento" cssClass="errors" />
        </th>
        <th>
            <form:input path="departamento" size="30" maxlength="30" />
        </th>
    </tr>
    <tr>
        <th>
            Provincia: <form:errors path="provincia" cssClass="errors" />
        </th>
        <th>
            <form:input path="provincia" size="30" maxlength="30" />
        </th>
    </tr>
    <tr>
        <th>
            Distrito: <form:errors path="distrito" cssClass="errors" />
        </th>
        <th>
            <form:input path="distrito" size="30" maxlength="30" />
        </th>
    </tr>
    <tr>
        <th colspan="2" style="text-align: center">
            <p class="submit"><input type="submit" value="Buscar locales"/>
          </p>
      </th>
    </tr>
  </table>
</form:form>

<h3>Resultados de la Busqueda</h3>
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
                <a href="<c:url value="/comentariolocal.htm?codLocal=${local.codLocal}"/>">ver Comentarios</a>
            </td>
            <td>
                <c:if test="${not empty param.showaddtour}">
                    <a href="<c:url value="/registrotour.htm?codLocal=${local.codLocal}"/>">Agregar a tour</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>    
<%@include  file="/WEB-INF/jsp/footer.jsp" %>
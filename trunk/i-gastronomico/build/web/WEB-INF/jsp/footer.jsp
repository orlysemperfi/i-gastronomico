  <table class="footer">
    <tr>
      <td><a href="<c:url value="/index.htm"/>">ir a Inicio</a></td>
      <td>
          <c:if test="${not empty SPRING_SECURITY_LAST_USERNAME}">
            <a title="MODIFICAR MIS DATOS" href="<c:url value="/formusuario.htm"/>"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></a>
          </c:if>
      </td>
      <td align="right">Derechos reservados</td>
    </tr>
  </table>

  </div> <%--fin de maincen--%>
  </div>   <%--fin de page--%>
</body>
</html>

<%@include file="/WEB-INF/jsp/header.jsp" %>
<h1>Bienvenido, </h1>
<H3>${usuario.nombreUsuario}</H3>
Haga click en el enlace para ingresar al portal
<a href="<c:url value="/login.htm"/>">Login</a>
<%@include file="/WEB-INF/jsp/footer.jsp" %>

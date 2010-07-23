<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/includes.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <c:set var="ctx" value="${pageContext.request.contextPath}"/>
        <title>iGastronomico-Portal</title>
        <style type="text/css">
            @import "${ctx}/css/demo.css";
        </style>
    </head>
    <body style="background: #fff">        
        <div id="maincen" style="width:230px; top:50%; left:50%; margin-top: -100px; margin-left: -100px; position: absolute; border:1px solid silver">
            <div style="text-align: center">
                <h3>Acceso Restringido</h3>
                <p>
                <img src="${ctx}/images/llave.GIF" />
                </p>
                <p class="enlaceSimple">
                <a href="<c:url value="/index.htm"/>" ><img src="images/toolbar/flechaizq.gif" align='absmiddle' class="search_image" />Volver </a>
                </p>
            </div>             
        </div>        
    </body>
</html>


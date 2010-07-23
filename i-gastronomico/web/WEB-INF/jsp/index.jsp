<%@include file="/WEB-INF/jsp/header.jsp" %>
<style type="text/css">
<!--
.centro {
	text-align: center;
}
.centroimagen {
	text-align: center;
}
-->
</style>
<script src="Scripts/swfobject_modified.js" type="text/javascript"></script>
<h3>Bienvenido al Portal  ${usuario.nombreUsuario}</h3>

<table width="650" border="0" align="center">
  <tr>
    <td align="center" valign="middle"><img src="${ctx}/images/carta1.gif" /></td>
  </tr>
  <tr>
    <td><span class="centro">i-Gastronómico es un portal joven y dinámico, dedicado a la publicación de los mejores lugares de Lima-Perú en donde se puede comer bien.

Como dueño del local, permite publicar las distintas opciones que ofrece un restaurante, de acuerdo a los tipos de platos que maneja, su ubicación, costos de menú, menú sugerido, entre otros.

Como cliente potencial, permite navegar entre las distintas opciones de restaurantes y categorias publicadas, asi como también organizar tours gastronómicos propios, sugiriendo de esta forma la preferencia por determinados lugares, de acuerdo a la experiencia culinaria adquirida.</span></td>
  </tr>
</table>
<div class="centroimagen">
<p class="centro">
  <object id="FlashID" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="650" height="267">
    <param name="movie" value="${ctx}/flash/29298.swf" />
    <param name="quality" value="high" />
    <param name="wmode" value="opaque" />
    <param name="swfversion" value="6.0.65.0" />
    <!-- Esta etiqueta param indica a los usuarios de Flash Player 6.0 r65 o posterior que descarguen la versión más reciente de Flash Player. Elimínela si no desea que los usuarios vean el mensaje. -->
    <param name="expressinstall" value="Scripts/expressInstall.swf" />
    <!-- La siguiente etiqueta object es para navegadores distintos de IE. Ocúltela a IE mediante IECC. -->
    <!--[if !IE]>-->
    <object type="application/x-shockwave-flash" data="${ctx}/flash/29298.swf" width="650" height="267">
      <!--<![endif]-->
      <param name="quality" value="high" />
      <param name="wmode" value="opaque" />
      <param name="swfversion" value="6.0.65.0" />
      <param name="expressinstall" value="Scripts/expressInstall.swf" />
      <!-- El navegador muestra el siguiente contenido alternativo para usuarios con Flash Player 6.0 o versiones anteriores. -->
      <div>
        <h4>El contenido de esta p&aacute;gina requiere una versi&oacute;n m&aacute;s reciente de Adobe Flash Player.</h4>
        <p><a href="http://www.adobe.com/go/getflashplayer"><img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Obtener Adobe Flash Player" width="112" height="33" /></a></p>
      </div>
      <!--[if !IE]>-->
    </object>
    <!--<![endif]-->
  </object>
</p>
<p>
</p>
</div>
 
<%@include  file="/WEB-INF/jsp/footer.jsp" %>
<script type="text/javascript">
<!--
swfobject.registerObject("FlashID");
//-->
</script>

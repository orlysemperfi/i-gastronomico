<%-- 
    Document   : tours
    Created on : 06/18/2010, 08:14:29 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
       
        <title>i-Gastronómico : aventura culinaria virtual</title>
        <meta http-equiv="Content-Language" content="English" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss-articles/" />

    </head>
    <script LANGUAGE="JavaScript">
<!--
   function Aceptar()
   {
      alert('Se guardo ');
	  top.frames['I1'].location='listaTours2.html';
	 <!-- document.formulario.action = 'listaTours2.html';
	<!--  document.formulario.submit();


	  return true;
   }
   function Cancelar()
   {
       document.formulario.textfield.value=" ";
	   document.formulario.textfield2.value=" ";
	   document.formulario.textfield5.value=" ";
	   document.formulario.textarea.value=" ";
	   document.formulario.select1[0].selected = true;
		document.formulario.checkbox1.checked = false;
	<!--   document.formulario.textfield.value=" ";
	<!--   document.formulario.submit();
      return true;
   }
//-->
</script>
<body>

<div id="wrap">

<div id="header">
<h1><a href="#">i-Gastronómico</a></h1>
<h2>aventura culinaria virtual</h2>
</div>

<div id="menu">
<ul>
<li><a href="index.html">Inicio</a></li>
<li><a href="comentarios.html">Comentarios</a></li>
<li><a href="registro.html">Registro</a></li>
<li><a href="consultas.html">Consultas</a></li>
<li><a href="tours.html">Tours</a></li>
<li><a href="contactenos.html">Contáctenos</a></li>
</ul>
</div>

<div id="content">

<div class="left">
<h2><a href="#">Tours</a></h2>
<p><br />
</p>
</div>
<div style="clear:both;">
	<form action="" name="formulario" id="formulario" method="post">
  <table width="300" border="1">
    <tr>
      <td>Codigo tour</td>
      <td>
        <p>
          <label>
            <input type="text" name="textfield" id="textfield" />
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td>Nombre tour</td>
      <td>
        <p>
          <label>
            <input type="text" name="textfield2" id="textfield2" />
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td>Codigo Usuario</td>
      <td>
        <p>
          <label>
            <input type="text" value="00001" name="textfield3" id="textfield3" disabled="disabled" />
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td> Local</td>
      <td>

          <p>
            <label>
              <select name="select1" id="select1" class="combo">
                <option>--Seleccione una opción--</option>
                <option value="00001">Acurio Restaurant</option>
                <option value="00002">Rustica</option>
                <option value="00003">El escondite del gordo</option>
              </select>
            </label>
          </p>

        <p>&nbsp;</p>
      </td>
    </tr>
    <tr>
      <td>Prioridad</td>
      <td>
        <p>
          <label>
            <input type="text" name="textfield5" id="textfield5" />
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td>Comentario</td>
      <td>
        <p>
          <label>
            <textarea name="textarea" id="textarea" cols="40" rows="3"></textarea>
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td>Flag_comparte tour</td>
      <td>
        <p>
          <label>
            <input type="checkbox" name="checkbox1" id="checkbox1" />
          </label>
        </p>
      </td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><table width="300" border="1">

        <tr>
          <td>
              <p>
              <label>
                <input type="button" name="btnAceptar" id="btnAceptar" value="Aceptar" onclick="Aceptar()" class="BotonComando"/>
              </label>
            </p>
          </td>
          <td>
            <p>
              <label>
 <input type="button" name="btnCancelar" id="btnCancelar" value="Cancelar" onclick="Cancelar()" class="BotonComando" />
              </label>
            </p>
          </td>
        </tr>
      </table>


    </tr>
  </table>
  </form>

  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</div>
<div style="clear:both;">
<iframe
	name=I1 align=middle
 	frameborder=0
	width=600 height=350
	src="listaTours1.html"></iframe>
</div>
</div>

<div id="footer"> Derechos Reservados a Backlog6 UPC-DEW
<a href="http://www.openwebdesign.org/"></a>
</div>

</div>
</body>
</html>

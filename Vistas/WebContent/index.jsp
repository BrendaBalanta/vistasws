<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jquery-3.2.1.min.js" type="text/javascript"></script>  
<script src="miscript.js" type="text/javascript"></script>  
<script type="text/javascript">





</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APLICACION PARA CONSUMOS DE SW</title>
</head>
<body bgcolor="#0066ff" >

<h1 align=center style="color:white;" >Consulta Tiempo de llegada</h1>

<table>
<tr>
<td>
 <form>
     <label for="nombre" style="color:white;">Direccion: </label>
     <input type="text" name="codigodocente" id="codigodoc">
     <input type="button" id="enviar" value="Enviar Codigo">
	<div style="display:none;" id="restp" > <br> <br> <h3></h3><pre id="respuesta"></pre></h3> </div> 
 </form>
 </td>
 <td>
 
 </td>
 </tr>
 </table>


</body>
</html>
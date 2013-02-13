<html>
<head>
<meta name="layout" content="main" />
<r:require module="application" />
<r:script>
 $("nav li:first").addClass("active");
 
 function status(){
 	$("trabajando....").append("div");
 }
</r:script>
</head>
<body>
	<h2 class="text-info">Seleccione un archivo</h2>
	<hr />
	<g:if test="${flash.message}">
		<div class="alert alert-block">
			${flash.message}
		</div>
	</g:if>
	<div id="formDatos">
		<g:uploadForm action="guardar">
			<g:field type="file" name="ingreso" />
			<g:actionSubmit onClick="status()" class="btn btn-primary"
				value="Subir" action="guardar" />
		</g:uploadForm>
	</div>
</body>
</html>
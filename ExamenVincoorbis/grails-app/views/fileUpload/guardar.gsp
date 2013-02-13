<html>
<head>
<meta name="layout" content="main" />
<r:require module="application" />
<r:script>
 $("nav li:first").addClass("active");
</r:script>
</head>
<body>
	<div id="actualizar">
		<g:if test="${flash.message == "Finalizo correctamente"}">
			<div class="alert alert-success">
				${flash.message}
			</div>
			<g:link class="btn" action="index">Atras</g:link>
		</g:if>
		<g:elseif test="${flash.message}">
			<div class="alert alert-block">
				${flash.message}
			</div>
			<g:link class="btn" action="index">Atras</g:link>
		</g:elseif>
		<g:remoteLink class="btn" action="ver" update="actualizar">Ver</g:remoteLink>
	</div>
</body>
</html>
<html>
<head>
<meta name="layout" content="main" />
<r:require module="application" />
<r:script>
 $("nav li:nth-child(2)").addClass("active");
 function from() {
	$.ajax({
		url : "${createLink(controller:'temperature',action:'calcularFrom')}",
		data : {
			fr : $("#f").val(),
			from : $("#from").val()
		},
		success : function(data) {
			$('#t').text(" = "+data);
		}
	});
}
function cambiar(){
	from();
}
</r:script>
</head>
<body>
	<h2 class="text-info">Conversor de Temperatura</h2>
	<hr/>
	<table id="tablaTemperature">
		<tr>
			<td>Seleccione tipo de conversion</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><g:select id="from" name="from"
					from="['CelsiusToFahrenheit','FahrenheitToCelsius']" onChange="cambiar()"/></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><input id="f" type="text" onkeyup="from()" /></td>
			<td><div id="t">${resultado}</div></td>
			<td></td>
		</tr>
	</table>
</body>
</html>
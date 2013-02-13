<html>
<head>
<meta name="layout" content="main" />
<r:require module="application" />
<r:script>
 $("nav li:last").addClass("active");
 
 
</r:script>
</head>
<body>
	<h2 class="text-info">Fechas</h2>
	<hr/>
	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<td>primer dia del mes actual</td>
				<td>fecha actual</td>
				<td>23:59 del último día del mes actual</td>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>
						${fechas[0]}
					</td>
					<td>
						${fechas[1]}
					</td>
					<td>
						${fechas[2]}
					</td>
				</tr>
				
		</tbody>
	</table>
</body>
</html>
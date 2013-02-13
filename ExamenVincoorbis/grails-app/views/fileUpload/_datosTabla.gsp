<g:link class="btn" action="index">Atras</g:link>

<table class="table table-hover table-bordered">
	<thead>
		<tr>
			<td>username</td>
			<td>cantidadDinero</td>
			<td>nombre</td>
		</tr>
	</thead>
	<tbody>
		<g:each in="${datos}" var="data">
			<tr>
				<td>
					${data.username}
				</td>
				<td>
					${data.cantidadDinero}
				</td>
				<td>
					${data.nombre}
				</td>
			</tr>
		</g:each>
	</tbody>
</table>
<div class="paginateButtons">
	<util:remotePaginate class="pagination" controller="fileUpload"
		action="ver" total="${datosTotal}" update="actualizar" max="5" />
</div>
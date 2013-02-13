package com.vincoorbis.examen

/**
 *
 *@author Ing.MIGUEL BAUTISTA
 *
 */
class FileUploadController {

	def almacenarDatosService

	def index() {
	}
	/*
	 * guardar valida si el archivo es correcto para ser procesado para luego ser guardado
	 */
	def guardar(){
		def archivo = request.getFile("ingreso")
		if(!archivo.empty && archivo.getContentType() == "text/plain"){
			try{
				almacenarDatosService.validar(archivo)
			}catch(RuntimeException exc){
				flash.message = exc
				return
			}
			flash.message = "Finalizo correctamente"
		}else if(archivo.empty){
			flash.message = "debe seleccionar un archivo valido"
			redirect(action:'index')
		}else{
			flash.message = "el archivo no puede ser procesado"
			redirect(action:'index')
		}
	}
	/*
	 * ver ajax paginacion
	 * 
	 */
	def ver(Integer max){
		params.max = Math.min(max ?: 10, 5)
		render(template:'datosTabla' , model:[datos:DatosArchivo.list(params),datosTotal:DatosArchivo.count])
	}	
}

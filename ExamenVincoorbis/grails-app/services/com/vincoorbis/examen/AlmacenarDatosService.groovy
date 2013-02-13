package com.vincoorbis.examen

/**
 *
 * @author Ing.MIGUEL BAUTISTA
 *
 */
class AlmacenarDatosService {
	/*
	 * 
	 * @params archivo archivo que va a hacer evaluado
	 */
	def validar(def archivo) {
		def count = 0
		def archivos = []
		archivo.getInputStream().text.eachLine{ line ->
			++count
			def lineaDeDatos = line.split(';')
			def datos = new DatosArchivo()
			datos.with{
				try{
					username = lineaDeDatos[0]
					cantidadDinero = lineaDeDatos[1].toInteger()
					nombre = lineaDeDatos[2]
				}catch(IndexOutOfBoundsException e){
					throw new RuntimeException("hubo un error en la linea:${count}")
				}
			}
			if(datos.validate()){
				datos.save()
			}else if(datos.hasErrors()){
				def errores = datos.errors
				errores.allErrors.each {
					throw new RuntimeException("hubo un error en la linea:${count}: valor=${it.rejectedValue}, error=${it.code}")
				}
			}
		}
	}
}

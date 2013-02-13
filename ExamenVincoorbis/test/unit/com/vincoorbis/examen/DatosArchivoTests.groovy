package com.vincoorbis.examen



import grails.test.mixin.*
import java.text.DecimalFormat
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(DatosArchivo)
class DatosArchivoTests {

	void testRestricciones() {

		def archivo = new DatosArchivo(username:"243",nombre:'miguel',cantidadDinero:434).save();
		def archivo2 = new DatosArchivo(username:"243",nombre:'jose',cantidadDinero:434434);

		assertNull(archivo2.save())

		assertTrue(archivo2.hasErrors())
		def errores = archivo2.errors
		assertEquals("243", errores.getFieldError('username').rejectedValue)
		assertEquals('unique', errores.getFieldError('username').code)
	}

	void testAlmacenamientoDatos(){
		def count = 0
		def archivo = new File("c:/pruebaDatos.txt").eachLine{ line ->
			def lineaDeDatos = line.split(';')
			DatosArchivo.withTransaction{ status ->
				def savePoint = status.createSavepoint()
				def datos = new DatosArchivo()

				datos.with{
					++count
					try{
						username = lineaDeDatos[0]
						cantidadDinero = lineaDeDatos[1].toInteger()
						nombre = lineaDeDatos[2]
					}catch(IndexOutOfBoundsException e){
						throw new Exception()
					}
				}
				if(datos.validate()){
					datos.save()
				}else{
					println "hubo un error en la linea:${count}"
					//throw new Exception("hubo un error en la linea:${count}")
					status.rollbackToSavepoint(savePoint)
				}
			}
		}
		def resultado = DatosArchivo.get(1)
		def resultados = DatosArchivo.list()
		resultados.each{println "${it.username};${it.cantidadDinero};${it.nombre}"}
		assertEquals "miguel", resultado.nombre
		assertEquals "00323", resultado.username
		assertEquals 43434, resultado.cantidadDinero
	}
}

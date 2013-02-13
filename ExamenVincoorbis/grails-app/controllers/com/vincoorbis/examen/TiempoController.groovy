package com.vincoorbis.examen

/**
 *
 * @author Ing.MIGUEL BAUTISTA
 *
 */
class TiempoController {
	/*
	 * 
	 * index devuelve un arreglo de fechas
	 * 
	 */
    def index() {
		//fecha1: primer dia del mes actual
		def fecha1 = new Date()
		fecha1.putAt(Calendar.DAY_OF_MONTH,1)
		
		//fechaComparar: fecha para comparar con la fecha final para obtener el ultimo dia del mes actual
		def fechaComparar = new Date()
		fechaComparar.putAt(Calendar.MONTH,new Date().getAt(Calendar.MONTH)+1)
		fechaComparar.putAt(Calendar.DAY_OF_MONTH,1)
		
		//fechaFinal: ultimo dia con hora 23:59 del mes actual
		def fechaFinal = new Date()
		fechaFinal.putAt(Calendar.HOUR,23)
		fechaFinal.putAt(Calendar.MINUTE,59)
		fechaFinal.putAt(Calendar.DAY_OF_MONTH,fechaComparar-fecha1)
		
		def fechas = [fecha1,new Date(),fechaFinal]
		[fechas:fechas]
	}
}

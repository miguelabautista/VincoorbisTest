package com.vincoorbis.examen

import org.tempuri.TempConvertSoap;



/**
 * 
 * @author Ing.MIGUEL BAUTISTA
 *
 */
class TemperatureController {
	TempConvertSoap temperatureClient

	def index() {
	}


	def calcularFrom(){
		def resultado
		if(params.from == "CelsiusToFahrenheit"){
			resultado = temperatureClient.celsiusToFahrenheit(params.fr) + " F"
		}else{
			resultado = temperatureClient.fahrenheitToCelsius(params.fr)+ " C"
		}

		render resultado
	}
}

package com.vincoorbis.examen

import static org.junit.Assert.*


import org.junit.*
import org.tempuri.TempConvertSoap;

class TemperatureServiceTestTests {

	TempConvertSoap temperatureClient


	@Test
	void testConversion() {
		def resultado = temperatureClient.celsiusToFahrenheit("43")
		println resultado
		assertEquals "109.4" , resultado
	}
}

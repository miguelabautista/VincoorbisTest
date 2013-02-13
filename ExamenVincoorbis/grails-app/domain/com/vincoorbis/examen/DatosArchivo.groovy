package com.vincoorbis.examen

class DatosArchivo {
	String username
	String nombre
	int cantidadDinero
	
    static constraints = {
    	username blank:false, matches: /\d{1,10}/ , unique:true
		nombre blank:false
		cantidadDinero blank:false, validator:{it >= 0}
	}
	
	static mapping = {
		sort "username"
	}
	
}

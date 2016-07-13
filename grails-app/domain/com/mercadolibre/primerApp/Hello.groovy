package com.mercadolibre.primerApp

class Hello {
    String mensajeBienvenida
    String personaQueSaludo
    static constraints = {
		mensajeBienvenida (blank: false)
		personaQueSaludo(blank:false)
    }
}

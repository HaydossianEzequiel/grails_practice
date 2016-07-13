package com.mercadolibre.primerApp

class Zapatilla {
    String title
    String price

    static constraints = {
	title(blank:false)
        price(blank:false)
    }
}

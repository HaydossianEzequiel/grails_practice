package com.mercadolibre.primerApp

class Comment {
	String comment
	Date dateCreated
	Date lastUpdate

	User user

	static constraints = {
		comment (blank:false, nullable: false, size:5..500)
		user (nullable: true)	
	 }

	String toString(){
   		return comment;		
	}
}

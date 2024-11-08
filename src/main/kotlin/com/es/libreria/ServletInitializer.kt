package com.es.libreria

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/*
	POST -> .../autores  -> añadir 1  -> @RequestBody : parsea los datos
	GET -> ../autores  -> obtener todos
	GET -> ../autores/{id} -> obtener 1  -> @PathVariable
	DELETE -> ../autores/{id}  -> eliminar por id
	PUT -> ../autores/{id}  -> actualizar por id
	GET -> ../autores/{id}/libros
*/


class ServletInitializer : SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(LibreriaApplication::class.java)
	}

}

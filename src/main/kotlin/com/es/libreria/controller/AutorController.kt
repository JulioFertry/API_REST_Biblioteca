package com.es.libreria.controller

import com.es.libreria.model.Autor
import com.es.libreria.service.AutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/autores")
class AutorController {

    @Autowired
    private lateinit var autorService: AutorService

    /*
    RESPONSABILIDADES
    Manejar las solicitudes HTTP
    Comprobacion mínima de datos

        - Comprobar que lo que viene no es null
        - Llamar al Service
        - Responder al cliente
    */


    @GetMapping("/{id}") // URI de este método -> localhost:8081/autores/2
    fun getById(@PathVariable id: String?): Autor? {

        // Comprobación básica de los parámetros de entrada
        if (id.isNullOrEmpty()) {
            return null
        }

        return autorService.getById(id)
    }

}
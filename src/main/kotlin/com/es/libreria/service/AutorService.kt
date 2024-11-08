package com.es.libreria.service

import com.es.libreria.model.Autor
import com.es.libreria.repository.AutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@Service
class AutorService {

    @Autowired
    private lateinit var autorRepository: AutorRepository

    /*
    RESPONSABILIDADES
    Controlar la lógica de negocio
    Comunicarse con el Repository
     */


    @GetMapping("/{id}")
    fun getById(id: String): Autor? {

        // 1º Implementar la logica de negocio
        var idL: Long = 0
        try {
            val idL: Long = id.toLong()
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }

        // 2º Comunicacion con repository
        val autor: Autor? = autorRepository.findByIdOrNull(idL)
        // Otra forma: val autor: Autor = autorRepository.findById(idL).orElse(null)
        return autor
    }


    @PostMapping("/")
    fun insert(@RequestBody autor: Autor): Autor {
        println(autor)
        return autor
    }

}
package com.es.libreria.repository

import com.es.libreria.model.Autor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface AutorRepository: JpaRepository<Autor, Long> { // <T, ID>
}
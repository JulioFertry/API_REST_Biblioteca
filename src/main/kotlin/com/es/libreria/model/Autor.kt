package com.es.libreria.model

import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.time.LocalDate


@Entity
@Table(name = "autores")
data class Autor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var nombre: String,

    var nacionalidad: String,

    @Column(name = "anio_nacimiento")
    var anioNacimiento: Int,

    @Column(length = 1000)
    var biografia: String? = null,

    @OneToMany(mappedBy = "autor", cascade = [jakarta.persistence.CascadeType.ALL], orphanRemoval = true)
    @JsonManagedReference
    val libros: MutableList<Libro> = mutableListOf()
)
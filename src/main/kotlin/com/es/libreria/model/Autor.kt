package com.es.libreria.model

import jakarta.persistence.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.time.LocalDate


@Entity
@Table(name = "autores")
data class Autor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var nombre: String,

    var nacionalidad: String,

    @Column(name = "anio_nacimientos")
    @Temporal(TemporalType.DATE) // Trata el atributo como Date
    var anioNacimiento: LocalDate,

    @Column(length = 1000)
    var biografia: String? = null,

    @OneToMany(mappedBy = "autor", cascade = [jakarta.persistence.CascadeType.ALL], orphanRemoval = true)
    val libros: MutableList<Libro> = mutableListOf()
)
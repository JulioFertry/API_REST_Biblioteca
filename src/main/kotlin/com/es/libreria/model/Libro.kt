package com.es.libreria.model

import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "libros")
data class Libro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var titulo: String,

    var genero: String,

    @Column(name = "anio_publicacion")
    @Temporal(TemporalType.DATE) // Trata el atributo como Date
    var anioPublicacion: LocalDate,

    var precio: Double,

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    var autor: Autor
)
package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity
data class Deck(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val description: String? = null,
)
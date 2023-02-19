package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity
data class Answer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val answer: String,
    val correct: Boolean
)
package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity(name = "appUser")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
    val email: String,
    val password: String,

)
package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity
data class Tag(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    @ManyToMany(mappedBy = "tags")
    val cards: Set<Card> = emptySet()
)


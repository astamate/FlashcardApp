package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "user_decks")
data class UserDecks(
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @Id
    @ManyToOne
    @JoinColumn(name = "deck_id")
    val deck: Deck
)
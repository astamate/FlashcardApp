package com.flashcards.app.service.deck

import com.flashcards.app.model.entity.Deck

interface DeckService {
    fun findAll(): List<Deck>
    fun findById(id: Long): Deck
    fun save(deck: Deck): Deck
    fun deleteById(id: Long)
}
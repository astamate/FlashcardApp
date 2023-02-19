package com.flashcards.app.service.card

import com.flashcards.app.model.entity.Card

interface CardService {
    fun findAll(): List<Card>
    fun findById(id: Long): Card
    fun save(card: Card): Card
    fun deleteById(id: Long)
}
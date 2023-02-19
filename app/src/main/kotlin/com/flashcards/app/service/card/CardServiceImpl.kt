package com.flashcards.app.service.card

import com.flashcards.app.model.entity.Card
import com.flashcards.app.repository.CardRepository
import org.springframework.stereotype.Service

@Service
class CardServiceImpl(private val cardRepository: CardRepository) : CardService {

    override fun findAll(): List<Card> = cardRepository.findAll()

    override fun findById(id: Long): Card =
        cardRepository.findById(id).orElseThrow { NoSuchElementException("Card not found") }

    override fun save(card: Card): Card = cardRepository.save(card)

    override fun deleteById(id: Long) = cardRepository.deleteById(id)
}
package com.flashcards.app.service.deck

import com.flashcards.app.model.entity.Deck
import com.flashcards.app.repository.DeckRepository
import org.springframework.stereotype.Service

@Service
class DeckServiceImpl(private val deckRepository: DeckRepository) : DeckService {

    override fun findAll(): List<Deck> = deckRepository.findAll()

    override fun findById(id: Long): Deck =
        deckRepository.findById(id).orElseThrow { NoSuchElementException("Deck not found") }

    override fun save(deck: Deck): Deck = deckRepository.save(deck)

    override fun deleteById(id: Long) = deckRepository.deleteById(id)
}
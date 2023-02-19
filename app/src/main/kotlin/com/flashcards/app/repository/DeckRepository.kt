package com.flashcards.app.repository

import com.flashcards.app.model.entity.Deck
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DeckRepository : JpaRepository<Deck, Long>
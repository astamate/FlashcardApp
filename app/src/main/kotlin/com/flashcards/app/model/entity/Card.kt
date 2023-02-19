package com.flashcards.app.model.entity

import jakarta.persistence.*

@Entity
data class Card(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val question: String,
    val notes: String? = null,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val answers: List<Answer> = emptyList(),
    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
        name = "card_tags",
        joinColumns = [JoinColumn(name = "card_id")],
        inverseJoinColumns = [JoinColumn(name = "tag_id")]
    )
    val tags: Set<Tag> = emptySet()
)
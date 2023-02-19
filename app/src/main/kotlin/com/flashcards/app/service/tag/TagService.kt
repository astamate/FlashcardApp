package com.flashcards.app.service.tag

import com.flashcards.app.model.entity.Tag

interface TagService {
    fun findAll(): List<Tag>
    fun findById(id: Long): Tag
    fun save(tag: Tag): Tag
    fun deleteById(id: Long)
}
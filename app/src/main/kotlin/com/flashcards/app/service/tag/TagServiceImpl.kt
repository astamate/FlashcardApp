package com.flashcards.app.service.tag

import com.flashcards.app.model.entity.Tag
import com.flashcards.app.repository.TagRepository
import org.springframework.stereotype.Service


@Service
class TagServiceImpl(private val tagRepository: TagRepository) : TagService {

    override fun findAll(): List<Tag> = tagRepository.findAll()

    override fun findById(id: Long): Tag =
        tagRepository.findById(id).orElseThrow { NoSuchElementException("Tag not found") }

    override fun save(tag: Tag): Tag = tagRepository.save(tag)

    override fun deleteById(id: Long) = tagRepository.deleteById(id)
}
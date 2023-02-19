package com.flashcards.app.service.user

import com.flashcards.app.model.dto.UserDTO
import com.flashcards.app.model.entity.User
import com.flashcards.app.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun getAll(): List<User> = userRepository.findAll()

    override fun getById(id: Long): User =
        userRepository.findById(id).orElseThrow { NoSuchElementException("User not found") }

    override fun create(user: UserDTO): User = userRepository.save(user.toEntity())

    override fun delete(id: Long) {
        try {
            userRepository.deleteById(id)
        } catch (e: EmptyResultDataAccessException) {
            logger.warn("Tried to delete invalid user: Id \"$id\"")
        }
    }
}
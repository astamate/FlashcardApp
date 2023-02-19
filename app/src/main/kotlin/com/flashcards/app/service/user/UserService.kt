package com.flashcards.app.service.user

import com.flashcards.app.model.dto.UserDTO
import com.flashcards.app.model.entity.User

interface UserService {
    fun getAll(): List<User>
    fun getById(id: Long): User
    fun create(user: UserDTO): User
    fun delete(id: Long)
}
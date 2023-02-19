package com.flashcards.app.model.dto

import com.flashcards.app.model.entity.User
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class UserDTO(
    val id: Long?,
    @NotBlank
    @Size(min = 2, max = 100)
    val name: String,
    @NotBlank
    @Email
    val email: String,
    @NotBlank
    @Size(min = 8, max = 100)
    val password: String,
) {
    fun toEntity(): User = User(id = id, name = name, email = email, password = password)
}

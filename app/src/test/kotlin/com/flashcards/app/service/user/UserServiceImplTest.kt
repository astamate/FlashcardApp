package com.flashcards.app.service.user

import com.flashcards.app.model.dto.UserDTO
import com.flashcards.app.model.entity.User
import com.flashcards.app.repository.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.dao.EmptyResultDataAccessException
import java.util.*

class UserServiceTest {

    @MockK
    lateinit var userRepository: UserRepository

    private lateinit var userService: UserService

    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)
        userService = UserServiceImpl(userRepository)
    }

    @Test
    fun `test get all users`() {
        val users = listOf(
            User(id = 1, name = "John Doe", email = "john.doe@example.com", password = "password"),
            User(id = 2, name = "Jane Doe", email = "jane.doe@example.com", password = "password")
        )
        every { userRepository.findAll() } returns users

        val result = userService.getAll()

        assertEquals(result,users)
    }

    @Test
    fun `test get user by id`() {
        val user = User(id = 1, name = "John Doe", email = "john.doe@example.com", password = "password")
        every { userRepository.findById(1) } returns Optional.of(user)

        val result = userService.getById(1)

        assertEquals(result,user)
    }

    @Test
    fun `when getById doesn't find user it should throw NoSuchElementException`() {
        val userId = 1L
        val user = User(userId, "John Doe", "john.doe@example.com", "password")
        every { userRepository.findById(userId) } returns Optional.empty()

        assertThrows<NoSuchElementException> { userService.getById(userId) }
    }

    @Test
    fun `test create user`() {
        val user = UserDTO(id = 4L, name = "John Doe", email = "john.doe@example.com", password = "password")
        every { userRepository.save(any()) } returns user.toEntity()

        val result = userService.create(user)

        assertEquals(result.email,user.email)
        assertEquals(result.name,user.name)
    }


    @Test
    fun `test delete user`() {
        val user = User(id = 1, name = "John Doe", email = "john.doe@example.com", password = "password")
        every { userRepository.deleteById(1) } returns Unit

        userService.delete(1)

        verify(exactly = 1) { userRepository.deleteById(1) }
    }

    @Test
    fun `test delete invalid user`() {
        val user = User(id = 1, name = "John Doe", email = "john.doe@example.com", password = "password")
        every { userRepository.deleteById(1) } throws  EmptyResultDataAccessException(1)

        userService.delete(1)

        verify(exactly = 1) { userRepository.deleteById(1) }
    }
}
package com.github.mgzu.system.repository

import com.github.mgzu.system.entity.User
import io.quarkus.test.InjectMock
import io.quarkus.test.junit.QuarkusTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @author MaGuangZu
 * @since 2023-09-27
 */
@QuarkusTest
class UserRepositoryTest {
    @Inject
    lateinit var userRepository: UserRepository

    @Test
    fun save() {
        val user = User()
        userRepository.save(user)
        val all = userRepository.findAll()
        Assertions.assertEquals(1, all.size)
    }

}

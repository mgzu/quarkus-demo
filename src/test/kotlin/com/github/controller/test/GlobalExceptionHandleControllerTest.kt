package com.github.controller.test

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test

/**
 * @author MaGuangZu
 * @since 2023-08-25
 */
@QuarkusTest
class GlobalExceptionHandleControllerTest {

    @Test
    fun testHelloEndpoint() {
        given()
            .`when`().get("/exception/handle")
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("{\"code\":500,\"message\":\"Internal Server Error\",\"data\":null}"))
    }

}

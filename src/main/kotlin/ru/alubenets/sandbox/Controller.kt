package ru.alubenets.sandbox

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
        @Value("\${spring.application.name}") val applicationName: String,
        @Value("\${spring.application.version}") val applicationVersion: String
) {

    @GetMapping("/hello")
    fun welcomeMessage(): String {
        return "Welcome to $applicationName:$applicationVersion"
    }
}
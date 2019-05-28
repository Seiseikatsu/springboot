package com.example.demo

import com.example.demo.entity.Person
import com.example.demo.controller.PersonRespository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
    @Bean
    fun demoData(repo: PersonRespository): CommandLineRunner {
        return CommandLineRunner {
            repo.save(Person(firstName = "Max", lastName = "Mustermann"))
            repo.save(Person(firstName = "Peter", lastName = "Peterson"))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
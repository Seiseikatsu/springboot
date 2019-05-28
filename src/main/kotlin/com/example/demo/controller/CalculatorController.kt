package com.example.demo.controller

import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController {

    @RequestMapping("/calculate")
    fun calculate(@Param("value") value: String): String {
        return subtractInternal(value).toString()
    }

    private fun subtractInternal(value: String): Long {
        val split = value.split("-")
        return split.map { s -> addInternal(s) }.reduce { n1, n2 -> n1 - n2 }
    }

    private fun addInternal(value: String): Long {
        val split = value.split("+")
        return split.map { s -> multiplyInternal(s) }.reduce { n1, n2 -> n1 + n2 }
    }

    private fun multiplyInternal(value: String): Long {
        val split = value.split("x")
        return split.map { s -> divideInternal(s) }.reduce { n1, n2 -> n1 * n2 }
    }

    private fun divideInternal(value: String): Long {
        val split = value.split("/")
        return split.map { s -> s.toLong() }.reduce { n1, n2 -> n1 / n2 }
    }
}
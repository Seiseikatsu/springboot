package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SampleController {

    @RequestMapping("/")
    @ResponseBody
    fun home(): String {
        return "Hello World"
    }


}
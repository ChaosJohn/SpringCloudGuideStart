package com.chaosjohn.springcloud.guide.start.greeting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Autowired
    lateinit var properties: Properties

    @RequestMapping("/{languageCode}")
    fun getGreeting(@PathVariable languageCode: String) =
        properties.greetings.getOrDefault(languageCode.toUpperCase(), properties.greeting)

    @RequestMapping("/")
    fun getGreeting() = properties.greeting
}
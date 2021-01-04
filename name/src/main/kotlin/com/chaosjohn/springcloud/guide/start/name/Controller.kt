package com.chaosjohn.springcloud.guide.start.name

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Autowired
    lateinit var properties: Properties

    @RequestMapping("/")
    fun getName() = properties.name
}
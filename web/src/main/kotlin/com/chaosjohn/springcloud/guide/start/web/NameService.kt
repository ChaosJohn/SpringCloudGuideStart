package com.chaosjohn.springcloud.guide.start.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class NameService {

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun getName() = restTemplate.getForObject("http://localhost:7070", String::class.java)

}
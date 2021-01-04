package com.chaosjohn.springcloud.guide.start.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class GreetingService {

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun getGreeting(locale: String? = null) = restTemplate.getForObject("http://localhost:9090/${locale ?: ""}", String::class.java)

}
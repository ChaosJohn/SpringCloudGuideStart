package com.chaosjohn.springcloud.guide.start.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.RequestContextUtils
import javax.servlet.http.HttpServletRequest

@RestController
class Controller {
    @Autowired
    lateinit var nameService: NameService

    @Autowired
    lateinit var greetingService: GreetingService

    @RequestMapping
    fun index(request: HttpServletRequest): String {
        val locale = RequestContextUtils.getLocaleResolver(request)?.resolveLocale(request)?.language
        return "${greetingService.getGreeting(locale)} ${nameService.getName()}"
    }
}
package com.chaosjohn.springcloud.guide.start.greeting

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "variables")
class Properties {
    var greeting: String = ""
    var greetings: Map<String, String> = emptyMap()
}
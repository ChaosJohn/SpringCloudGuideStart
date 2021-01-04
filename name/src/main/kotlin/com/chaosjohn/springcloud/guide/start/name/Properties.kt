package com.chaosjohn.springcloud.guide.start.name

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "variables")
class Properties {
    var name: String = ""
}
package com.github.hanqyu.gradle.reproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class SpringBootApp

fun main(args: Array<String>) {
    runApplication<SpringBootApp>(*args)
}

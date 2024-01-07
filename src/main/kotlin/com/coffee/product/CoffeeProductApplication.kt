package com.coffee.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoffeeProductApplication

fun main(args: Array<String>) {
    runApplication<CoffeeProductApplication>(*args)
}

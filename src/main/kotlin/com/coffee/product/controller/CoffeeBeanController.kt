package com.coffee.product.controller

import com.coffee.product.model.coffeebean.RegisterCoffeeBeanRequest
import com.coffee.product.service.coffeebean.CoffeeBeanService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/product/coffee-bean")
class CoffeeBeanController(
    private val coffeeBeanService: CoffeeBeanService,
) {
    @PostMapping("/register")
    fun registerCoffeeBean(
        @RequestBody registerCoffeeBeanRequest: RegisterCoffeeBeanRequest,
    ) {
        coffeeBeanService.registerCoffeeBean(registerCoffeeBeanRequest)
    }

    @GetMapping("/list/{roasteryId}}")
    fun getCoffeeBeanList(
        @PathVariable roasteryId: String,
    ) {
        coffeeBeanService.getCoffeeBeanList(roasteryId)
    }
}

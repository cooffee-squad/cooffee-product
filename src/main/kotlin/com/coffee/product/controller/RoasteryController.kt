package com.coffee.product.controller

import com.coffee.product.model.roastery.RegisterRoasteryRequest
import com.coffee.product.service.roastery.RoasteryService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/product/roastery")
class RoasteryController(
    private val roasteryService: RoasteryService
) {

    @PostMapping("/register")
    fun registerRoastery(@RequestBody registerRoasteryRequest: RegisterRoasteryRequest) {
        roasteryService.registerRoastery(registerRoasteryRequest)
    }
    
}

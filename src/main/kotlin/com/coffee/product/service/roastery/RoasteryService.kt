package com.coffee.product.service.roastery

import com.coffee.product.model.roastery.RegisterRoasteryRequest

interface RoasteryService {
    fun registerRoastery(registerRoasteryRequest: RegisterRoasteryRequest): String
}

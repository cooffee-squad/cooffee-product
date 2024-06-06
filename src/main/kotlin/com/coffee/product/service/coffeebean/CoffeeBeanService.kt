package com.coffee.product.service.coffeebean

import com.coffee.product.model.coffeebean.RegisterCoffeeBeanRequest

interface CoffeeBeanService {
    fun registerCoffeeBean(registerCoffeeBeanRequest: RegisterCoffeeBeanRequest)

    fun getCoffeeBeanList(roasteryId: String)
}

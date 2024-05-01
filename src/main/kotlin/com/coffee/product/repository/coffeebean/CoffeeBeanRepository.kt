package com.coffee.product.repository.coffeebean

import com.coffee.product.domain.coffeebean.CoffeeBean
import com.coffee.product.domain.roastery.Roastery

interface CoffeeBeanRepository {
    fun findAllByRoastery(roastery: Roastery) : List<CoffeeBean>
}

package com.coffee.product.repository.coffeebean

import com.coffee.product.domain.coffeebean.CoffeeBean
import com.coffee.product.domain.roastery.Roastery
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CoffeeBeanJpaRepository : JpaRepository<CoffeeBean, UUID> {
    fun findAllByRoastery(roastery: Roastery): List<CoffeeBean>
}

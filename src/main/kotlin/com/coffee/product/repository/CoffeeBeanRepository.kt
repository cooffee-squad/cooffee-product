package com.coffee.product.repository

import com.coffee.product.domain.coffeebean.CoffeeBean
import com.coffee.product.domain.roastery.Roastery
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

interface CoffeeBeanJpaRepository : JpaRepository<CoffeeBean, UUID> {
    fun findAllByRoastery(roastery: Roastery): List<CoffeeBean>
}

@Repository
class CoffeeBeanRepository(
    private val coffeeBeanJpaRepository: CoffeeBeanJpaRepository,
) {
    fun findAllByRoastery(roastery: Roastery): List<CoffeeBean> = coffeeBeanJpaRepository.findAllByRoastery(roastery)
}

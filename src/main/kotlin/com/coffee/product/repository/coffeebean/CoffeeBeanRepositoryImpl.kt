package com.coffee.product.repository.coffeebean

import com.coffee.product.domain.coffeebean.CoffeeBean
import com.coffee.product.domain.roastery.Roastery
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class CoffeeBeanRepositoryImpl(
    private val coffeeBeanJpaRepository: CoffeeBeanJpaRepository
) : CoffeeBeanRepository {
    override fun findAllByRoastery(roastery: Roastery): List<CoffeeBean> = coffeeBeanJpaRepository.findAllByRoastery(roastery)

}

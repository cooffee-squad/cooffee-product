package com.coffee.product.service.coffeebean

import com.coffee.product.domain.roastery.Roastery
import com.coffee.product.model.coffeebean.RegisterCoffeeBeanRequest
import com.coffee.product.repository.coffeebean.CoffeeBeanRepository
import com.coffee.product.repository.roastery.RoasteryRepository
import org.springframework.stereotype.Service

@Service
class CoffeeBeanServiceImpl(
    private val coffeeBeanRepository: CoffeeBeanRepository,
    private val roasteryRepository: RoasteryRepository
) : CoffeeBeanService {
    override fun registerCoffeeBean(registerCoffeeBeanRequest: RegisterCoffeeBeanRequest) {
    }

    override fun getCoffeeBeanList(roasteryId: String) {
        val roastery: Roastery = roasteryRepository.getRoasteryById(roasteryId)
        coffeeBeanRepository.findAllByRoastery(roastery)
    }
}

package com.coffee.product.service.roastery

import com.coffee.product.model.roastery.RegisterRoasteryRequest
import com.coffee.product.model.roastery.toEntity
import com.coffee.product.repository.RoasteryRepository
import org.springframework.stereotype.Service

@Service
class RoasteryServiceImpl(
    private val roasteryRepository: RoasteryRepository
) : RoasteryService {

    override fun registerRoastery(registerRoasteryRequest: RegisterRoasteryRequest): String {
        val roastery = registerRoasteryRequest.toEntity()
        return roasteryRepository.register(roastery).toString()
    }
}

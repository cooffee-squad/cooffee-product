package com.coffee.product.service.roastery

import com.coffee.product.domain.roastery.Roastery
import com.coffee.product.model.roastery.RegisterRoasteryRequest
import com.coffee.product.repository.RoasteryRepository
import org.springframework.stereotype.Service

@Service
class RoasteryServiceImpl(
    private val roasteryRepository: RoasteryRepository
) : RoasteryService {

    override fun registerRoastery(registerRoasteryRequest: RegisterRoasteryRequest) {
        val roastery = Roastery().apply {
            name = registerRoasteryRequest.name
            location = registerRoasteryRequest.location
            instagramId = registerRoasteryRequest.instagramId
            description = registerRoasteryRequest.description
            careerList = listOf("CEO", "CFO", "CTO")
        }

        roasteryRepository.save(roastery)
    }
}

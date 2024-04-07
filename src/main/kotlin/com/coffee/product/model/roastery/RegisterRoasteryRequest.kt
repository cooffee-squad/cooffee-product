package com.coffee.product.model.roastery

import com.coffee.product.domain.roastery.Roastery

data class RegisterRoasteryRequest(
    val name: String,
    val location: String,
    val instagramId: String,
    val description: String,
) {
    fun toEntity(request: RegisterRoasteryRequest): Roastery {
        return Roastery().apply {
            name = request.name
            location = request.location
            instagramId = request.instagramId
            description = request.description
        }
    }
}

package com.coffee.product.model.roastery

import com.coffee.product.domain.roastery.Roastery

data class RegisterRoasteryRequest(
    val name: String,
    val location: String,
    val instagramId: String,
    val description: String,
)
fun RegisterRoasteryRequest.toEntity(): Roastery {
    val roastery = Roastery()
    roastery.name = this.name
    roastery.location = this.location
    roastery.instagramId = this.instagramId
    roastery.description = this.description
    return roastery
}


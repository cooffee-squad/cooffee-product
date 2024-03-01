package com.coffee.product.model.roastery

data class RegisterRoasteryRequest(
    val name: String,
    val location: String,
    val instagramId: String,
    val description: String,
)

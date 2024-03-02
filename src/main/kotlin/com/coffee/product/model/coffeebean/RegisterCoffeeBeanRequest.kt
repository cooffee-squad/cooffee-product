package com.coffee.product.model.coffeebean

data class RegisterCoffeeBeanRequest(
    val price: Float,
    val isDecaffeine: Boolean,
    val description: String,
    val isAcidity: Boolean,
    val roastingType: String,
    val tradeType: String,
    val isSingleOrigin: Boolean
)

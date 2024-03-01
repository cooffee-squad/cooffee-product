package com.coffee.product.repository

import com.coffee.product.domain.roastery.Roastery

interface RoasteryRepository {
    fun save(roastery: Roastery)
}

package com.coffee.product.repository

import com.coffee.product.domain.roastery.Roastery
import java.util.UUID

interface RoasteryRepository {
    fun register(roastery: Roastery): UUID
}

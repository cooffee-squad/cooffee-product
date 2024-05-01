package com.coffee.product.repository.roastery

import com.coffee.product.domain.roastery.Roastery
import java.util.UUID

interface RoasteryRepository {
    fun register(roastery: Roastery): UUID
    fun getRoasteryById(roasteryId: String): Roastery
}

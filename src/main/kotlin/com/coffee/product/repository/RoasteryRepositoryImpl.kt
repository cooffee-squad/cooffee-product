package com.coffee.product.repository

import com.coffee.product.domain.roastery.Roastery
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class RoasteryRepositoryImpl(
    private val roasteryJpaRepository: RoasteryJpaRepository
) : RoasteryRepository {

    override fun register(roastery: Roastery): UUID {
        return roasteryJpaRepository.save(roastery).roasteryId
    }

}

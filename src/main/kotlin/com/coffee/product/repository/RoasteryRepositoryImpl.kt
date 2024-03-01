package com.coffee.product.repository

import com.coffee.product.domain.roastery.Roastery
import org.springframework.stereotype.Repository

@Repository
class RoasteryRepositoryImpl(
    private val roasteryJpaRepository: RoasteryJpaRepository
) : RoasteryRepository {

    override fun save(roastery: Roastery) {
        roasteryJpaRepository.save(roastery)
    }

}

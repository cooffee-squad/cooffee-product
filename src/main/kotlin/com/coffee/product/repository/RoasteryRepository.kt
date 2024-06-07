package com.coffee.product.repository

import com.coffee.product.common.error.CustomException
import com.coffee.product.common.error.type.ExceptionType
import com.coffee.product.domain.roastery.Roastery
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RoasteryJpaRepository : JpaRepository<Roastery, UUID>

class RoasteryRepository(
    private val roasteryJpaRepository: RoasteryJpaRepository,
) {
    fun register(roastery: Roastery): UUID {
        return roasteryJpaRepository.save(roastery).roasteryId
    }

    fun getRoasteryById(roasteryId: String): Roastery {
        return roasteryJpaRepository.findById(UUID.fromString(roasteryId))
            .orElseThrow {
                throw CustomException(ExceptionType.ROASTERY_NOT_FOUND)
            }
    }
}

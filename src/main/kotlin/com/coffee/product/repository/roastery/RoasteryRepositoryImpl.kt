package com.coffee.product.repository.roastery

import com.coffee.product.common.error.CustomException
import com.coffee.product.common.error.type.ExceptionType
import com.coffee.product.domain.roastery.Roastery
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class RoasteryRepositoryImpl(
    private val roasteryJpaRepository: RoasteryJpaRepository,
) : RoasteryRepository {
    override fun register(roastery: Roastery): UUID {
        return roasteryJpaRepository.save(roastery).roasteryId
    }

    override fun getRoasteryById(roasteryId: String): Roastery {
        return roasteryJpaRepository.findById(UUID.fromString(roasteryId))
            .orElseThrow {
                throw CustomException(ExceptionType.ROASTERY_NOT_FOUND)
            }
    }
}

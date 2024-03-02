package com.coffee.product.repository

import com.coffee.product.domain.roastery.Roastery
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RoasteryJpaRepository: JpaRepository<Roastery, UUID> {

}

package com.coffee.product.domain.roastery

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
class Roastery {
    @Id
    @Column(unique = true, nullable = false, columnDefinition = "uuid")
    var roasteryId: UUID = UUID.randomUUID()

    @Column
    var location: String = ""

    @Column
    var instagramId: String = ""

    @Column
    var description: String = ""

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var careerList: List<String> = listOf()
}
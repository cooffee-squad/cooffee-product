package com.coffee.product.domain.coffeebean

import com.coffee.product.domain.coffeebean.enums.CoffeeFlavor
import com.coffee.product.domain.coffeebean.enums.CoffeeTool
import com.coffee.product.domain.coffeebean.enums.ProcessingType
import com.coffee.product.domain.coffeebean.enums.Recipe
import com.coffee.product.domain.coffeebean.enums.Region
import com.coffee.product.domain.coffeebean.enums.RoastingPoint
import com.coffee.product.domain.coffeebean.enums.TradeType
import com.coffee.product.domain.roastery.Roastery
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
class CoffeeBean {
    @Id
    @Column(unique = true, nullable = false, columnDefinition = "uuid")
    var id: UUID = UUID.randomUUID()

    @Column
    var price: Float = 0f

    @Column
    var isDecaffeine: Boolean = false

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var flavorNOtes: List<CoffeeFlavor> = listOf()

    @Column
    var description: String = ""

    @Column
    var isAcidity: Boolean = false

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var blendList: List<Region> = listOf()

    @Column
    var roastingType: RoastingPoint = RoastingPoint.DARK

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var processingType: List<ProcessingType> = listOf()

    @Column
    var tradeType: TradeType = TradeType.DIRECT_TRADE

    @Column
    var isSingleOrigin: Boolean = false

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var matchedCoffeeToolType: List<CoffeeTool> = listOf()

    @Column
    @JdbcTypeCode(SqlTypes.JSON)
    var matchedReciept: List<Recipe> = listOf()

    @ManyToOne
    @JoinColumn(name = "roastery_id")
    var roastery: Roastery? = null
}

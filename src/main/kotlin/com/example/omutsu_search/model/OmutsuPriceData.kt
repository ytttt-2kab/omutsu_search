package com.example.omutsu_search.model

import java.math.BigDecimal
import java.util.*

data class OmutsuPriceData (
    val regDate: Date,
    val janCode: String,
    val totalPrice: BigDecimal,
    val price: BigDecimal,
    val shopName: String,
    val shopUrl: String,
)
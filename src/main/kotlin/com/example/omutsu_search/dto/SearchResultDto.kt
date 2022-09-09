package com.example.omutsu_search.dto

import java.time.LocalDate

data class SearchResultDto(
    var rank: Int,
    var size: String,
    var type: String,
    var brand: String,
    var janCode: String,
    var name: String,
    var count: Int,
    var totalPrice: Float,
    var price: Float,
    var shopName: String,
    var shopUrl: String,
    var regDate: LocalDate
)

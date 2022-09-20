package com.example.omutsu_search.dto

import java.time.LocalDate

data class SearchResultDto(
    val rank: Int,
    val regDate: LocalDate,
    val janCode: String,
    val totalPrice: Float,
    val price: Float,
    val shopName: String,
    val shopUrl: String,
    val brand: String,
    val size: String,
    val type: String,
    val count: Int,
    val name: String,
)
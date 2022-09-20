package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.SizeMapper
import com.example.omutsu_search.model.Size
import org.springframework.stereotype.Repository

@Repository
class SizeDao(private val sizeMapper: SizeMapper) {
    fun selectAll(): List<Size>? {
        return sizeMapper.selectAll()
    }
}
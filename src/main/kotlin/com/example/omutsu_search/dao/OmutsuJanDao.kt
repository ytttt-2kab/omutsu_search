package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.OmutsuJanMapper
import com.example.omutsu_search.model.OmutsuJan
import org.springframework.stereotype.Repository

@Repository
class OmutsuJanDao(private val omutsuJanMapper: OmutsuJanMapper) {
    fun selectAll(): List<OmutsuJan>? {
        return omutsuJanMapper.selectAll()
    }

    fun selectById(brand_id: Int, type_id: Int, size_id: Int): List<OmutsuJan>? {
        return omutsuJanMapper.selectById(brand_id, type_id, size_id)
    }
}
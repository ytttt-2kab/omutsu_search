package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.OmutsuJanMapper
import com.example.omutsu_search.model.OmutsuJan
import org.springframework.stereotype.Repository

@Repository
class OmutsuJanDao(private val omutsuJanMapper: OmutsuJanMapper) {
    fun selectAll():List<OmutsuJan>{
        return omutsuJanMapper.selectAll()
    }
}
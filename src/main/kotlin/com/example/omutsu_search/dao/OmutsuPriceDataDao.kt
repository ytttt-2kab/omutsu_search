package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.OmutsuPriceDataMapper
import com.example.omutsu_search.model.OmutsuPriceData
import org.springframework.stereotype.Repository

@Repository
class OmutsuPriceDataDao(private val omutsuPriceDataMapper: OmutsuPriceDataMapper) {
    fun selectAll():List<OmutsuPriceData>{
        return omutsuPriceDataMapper.selectAll()
    }
}
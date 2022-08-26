package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.BrandMapper
import com.example.omutsu_search.model.Brand
import org.springframework.stereotype.Repository

@Repository
class BrandDao(private val brandMapper: BrandMapper) {
    fun test():List<Brand>{
        return brandMapper.selectAll()
//        return emptyList()
    }
}
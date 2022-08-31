package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.TypeMapper
import com.example.omutsu_search.model.Type
import org.springframework.stereotype.Repository

@Repository
class TypeDao(private val typeMapper: TypeMapper) {
    fun selectAll():List<Type>{
        return typeMapper.selectAll()
    }
}
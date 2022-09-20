package com.example.omutsu_search.mapper

import com.example.omutsu_search.model.Type
import org.apache.ibatis.annotations.Mapper

@Mapper
interface TypeMapper {
    fun selectByPrimaryKey(id: Int): Type
    fun selectAll(): List<Type>
}
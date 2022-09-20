package com.example.omutsu_search.mapper

import com.example.omutsu_search.model.Brand
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BrandMapper {
    fun selectByPrimaryKey(id: Int): Brand?
    fun selectAll(): List<Brand>?
}
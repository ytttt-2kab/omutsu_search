package com.example.omutsu_search.mapper

import com.example.omutsu_search.model.Size
import org.apache.ibatis.annotations.Mapper

@Mapper
interface SizeMapper {
    fun selectByPrimaryKey(id: Int): Size
    fun selectAll(): List<Size>
}
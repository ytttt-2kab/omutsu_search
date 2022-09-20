package com.example.omutsu_search.mapper

import com.example.omutsu_search.model.OmutsuJan
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface OmutsuJanMapper {
    fun selectByPrimaryKey(janCode: String): OmutsuJan?
    fun selectById(
        @Param("brand_id") brand_id: Int,
        @Param("type_id") type_id: Int,
        @Param("size_id") size_id: Int
    ): List<OmutsuJan>?

    fun selectAll(): List<OmutsuJan>?
}
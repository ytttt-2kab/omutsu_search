package com.example.omutsu_search.mapper

import com.example.omutsu_search.dto.SearchResultDto
import com.example.omutsu_search.model.OmutsuPriceData
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import java.util.*

@Mapper
interface OmutsuPriceDataMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    fun selectByPrimaryKey(@Param("regDate") regDate: Date, @Param("janCode") janCode: String): OmutsuPriceData?

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    fun selectAll(): List<OmutsuPriceData>?
    fun selectByOmutsuJanList(
        @Param("omutsuJanList") omutsuJanList: List<String>,
        @Param("regDate") regDate: Date
    ): List<SearchResultDto>?
}
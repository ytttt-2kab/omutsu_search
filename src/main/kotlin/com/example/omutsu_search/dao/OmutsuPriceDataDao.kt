package com.example.omutsu_search.dao

import com.example.omutsu_search.mapper.OmutsuPriceDataMapper
import com.example.omutsu_search.model.OmutsuPriceData
import com.example.omutsu_search.util.DateUtil
import com.example.omutsu_search.dto.SearchResultDto
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class OmutsuPriceDataDao(private val omutsuPriceDataMapper: OmutsuPriceDataMapper) {
    fun selectAll():List<OmutsuPriceData>?{
        var ret = omutsuPriceDataMapper.selectAll()
        return ret
    }

    fun selectByOmutsuJanList(omutsuJanList: List<String>, regDate: LocalDate):List<SearchResultDto>?{
        var ret = omutsuPriceDataMapper.selectByOmutsuJanList(omutsuJanList, DateUtil.localDate2Date(regDate))
        return ret
    }
}
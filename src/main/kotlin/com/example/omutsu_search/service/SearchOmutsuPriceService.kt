package com.example.omutsu_search.service

import com.example.omutsu_search.dao.OmutsuJanDao
import com.example.omutsu_search.dao.OmutsuPriceDataDao
import com.example.omutsu_search.dto.SearchResultDto
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class SearchOmutsuPriceService (private val omutsuJanDao: OmutsuJanDao, private val omutsuPriceDataDao: OmutsuPriceDataDao) {
    fun search(brand_id: Int, type_id: Int, size_id: Int, date: LocalDate): List<SearchResultDto>? {
        val omutsuJans = omutsuJanDao.selectById(brand_id, type_id, size_id)
        val omutsuJanCodes = omutsuJans.map { obj -> return@map obj.janCode }
        val result = omutsuPriceDataDao.selectByOmutsuJanList(omutsuJanCodes, date)
        return result
    }
}
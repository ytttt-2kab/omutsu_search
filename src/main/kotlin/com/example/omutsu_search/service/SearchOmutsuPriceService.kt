package com.example.omutsu_search.service

import com.example.omutsu_search.dao.OmutsuJanDao
import com.example.omutsu_search.dao.OmutsuPriceDataDao
import com.example.omutsu_search.dto.SearchResultDto
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class SearchOmutsuPriceService(
    private val omutsuJanDao: OmutsuJanDao,
    private val omutsuPriceDataDao: OmutsuPriceDataDao
) {
    fun search(brand_id: Int = 1, type_id: Int = 1, size_id: Int = 1, date: LocalDate = LocalDate.now()): List<SearchResultDto> {
        // Todo: brand指定なしの場合、allにする
        val omutsuJans = omutsuJanDao.selectById(brand_id, type_id, size_id)
        val omutsuJanCodes = omutsuJans.map { obj -> return@map obj.janCode }
        val result = omutsuJanCodes.let { omutsuPriceDataDao.selectByOmutsuJanList(it, date) }
        return result
    }
}
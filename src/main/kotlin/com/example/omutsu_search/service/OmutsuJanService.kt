package com.example.omutsu_search.service

import com.example.omutsu_search.dao.OmutsuJanDao
import com.example.omutsu_search.model.OmutsuJan
import org.springframework.stereotype.Service

@Service
class OmutsuJanService(private val omutsuJanDao: OmutsuJanDao) {
    fun selectAll(): List<OmutsuJan> {
        return omutsuJanDao.selectAll()
    }
}
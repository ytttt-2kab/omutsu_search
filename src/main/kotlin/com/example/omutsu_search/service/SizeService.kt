package com.example.omutsu_search.service

import com.example.omutsu_search.dao.SizeDao
import com.example.omutsu_search.model.Size
import org.springframework.stereotype.Service

@Service
class SizeService(private val sizeDao: SizeDao) {
    fun selectAll(): List<Size>? {
        return sizeDao.selectAll()
    }
}
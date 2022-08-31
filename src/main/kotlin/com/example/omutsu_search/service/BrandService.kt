package com.example.omutsu_search.service

import com.example.omutsu_search.dao.BrandDao
import com.example.omutsu_search.model.Brand
import org.springframework.stereotype.Service

@Service
class BrandService(private val brandDao: BrandDao) {
    fun selectAll():List<Brand>{
        return brandDao.selectAll()
    }
}
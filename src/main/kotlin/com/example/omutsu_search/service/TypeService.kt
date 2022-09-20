package com.example.omutsu_search.service

import com.example.omutsu_search.dao.TypeDao
import com.example.omutsu_search.model.Type
import org.springframework.stereotype.Service

@Service
class TypeService(private val typeDao: TypeDao) {
    fun selectAll(): List<Type> {
        return typeDao.selectAll()
    }
}
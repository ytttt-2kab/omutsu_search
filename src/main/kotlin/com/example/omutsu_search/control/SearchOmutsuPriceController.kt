package com.example.omutsu_search.control

import com.example.omutsu_search.model.OmutsuPriceData
import com.example.omutsu_search.service.SearchOmutsuPriceService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.*

@Controller
class SearchOmutsuPriceController(private val searchOmutsuPriceService: SearchOmutsuPriceService) {
    @PostMapping("/search")
    fun searchOmutsuPrice(@RequestParam brand_id: Int, @RequestParam type_id: Int, @RequestParam size_id: Int, @RequestParam date: Date): ResponseEntity<List<OmutsuPriceData>>{
        val result = searchOmutsuPriceService.search(brand_id, type_id, size_id, date)
        return ResponseEntity.ok(result)
    }
}
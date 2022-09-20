package com.example.omutsu_search.control

import com.example.omutsu_search.service.SearchOmutsuPriceService
import com.example.omutsu_search.dto.SearchResultDto
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.time.LocalDate

@Controller
class SearchOmutsuPriceController(private val searchOmutsuPriceService: SearchOmutsuPriceService) {
    @PostMapping("/search")
    fun PostSearchOmutsuPrice(
        @RequestParam brand_id: Int,
        @RequestParam type_id: Int,
        @RequestParam size_id: Int,
        @RequestParam date: LocalDate
    ): ResponseEntity<List<SearchResultDto>?> {
        val result = searchOmutsuPriceService.search(brand_id, type_id, size_id, date)
        return ResponseEntity.ok(result)
    }

    @GetMapping("/")
    fun getSearchOmutsuPrice(model: Model): String {
        val brand_id = 1
        val type_id = 1
        val size_id = 1
        val date = LocalDate.now()
        val result = searchOmutsuPriceService.search(brand_id, type_id, size_id, date)
        model.addAttribute("result", result)
        return "index"
    }
}
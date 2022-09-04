package com.example.omutsu_search.control

import com.example.omutsu_search.model.Brand
import com.example.omutsu_search.service.BrandService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BrandController(private val brandService: BrandService) {
    @GetMapping("/test")
    fun test(): ResponseEntity<List<Brand>>{
        val result = brandService.selectAll()
        return ResponseEntity.ok(result)
    }
    @GetMapping("/")
    fun test2(model: Model): String{
        val result = brandService.selectAll()
//        model.addAttribute("message", "qwertyu");
        model.addAttribute("result", result);
        return "index"
    }
}
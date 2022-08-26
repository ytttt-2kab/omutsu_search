package com.example.omutsu_search.control

import com.example.omutsu_search.model.Brand
import com.example.omutsu_search.service.BrandService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

//import org.springframework.web.bind.annotation.PostMapping

@Controller
class BrandController(private val brandService: BrandService) {
    @GetMapping("/test")
    fun test(): ResponseEntity<List<Brand>>{
        val result = brandService.test()
        return ResponseEntity.ok(result)
    }
}
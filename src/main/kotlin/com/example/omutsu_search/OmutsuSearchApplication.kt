package com.example.omutsu_search

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OmutsuSearchApplication

fun main(args: Array<String>) {
	runApplication<OmutsuSearchApplication>(*args)
}

//Todo: postgresの設定が足りない？（認証型10が…）
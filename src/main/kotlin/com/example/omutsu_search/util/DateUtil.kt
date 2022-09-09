package com.example.omutsu_search.util

import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*


class DateUtil {
    companion object {
        private val DATE_FORMAT = "yyyy-MM-dd"

        fun string2LocalDate(date: String?): LocalDate? {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_FORMAT))
        }

        fun date2LocalDate(date: Date): LocalDate? {
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        }

        fun localDate2Date(localDate: LocalDate): Date? {
            return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant())
        }
    }
}
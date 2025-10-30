package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class No10699Test : StringSpec({
    "오늘 날짜 : https://www.acmicpc.net/problem/10699" {
        val expected = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        No10699().solve() shouldBe expected
    }
})

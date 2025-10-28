package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27889Test : StringSpec({
    "특별한 학교 이름 : https://www.acmicpc.net/problem/27889" {
        val testCases = listOf(
            "NLCS" to "North London Collegiate School",
            "BHA" to "Branksome Hall Asia",
            "KIS" to "Korea International School",
            "SJA" to "St. Johnsbury Academy"
        )

        testCases.forEach { (given, expected) ->
            No27889().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

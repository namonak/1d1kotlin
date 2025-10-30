package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28113Test : StringSpec({
    "정보섬의 대중교통 : https://www.acmicpc.net/problem/28113" {
        val testCases = listOf(
            "10 5 15" to "Bus",
            "1 1 1" to "Anything",
            "1 100 1" to "Subway"
        )

        testCases.forEach { (given, expected) ->
            No28113().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

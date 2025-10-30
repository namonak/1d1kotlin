package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13549Test : StringSpec({
    "숨바꼭질 3 : https://www.acmicpc.net/problem/13549" {
        val testCases = listOf(
            "5 17" to "2",
            "10 10" to "0",
            "20 5" to "15",
            "5 0" to "5",
            "0 100000" to "6",
            "100000 0" to "100000",
            "1 64" to "0",
            "50 51" to "1"
        )

        testCases.forEach { (given, expected) ->
            No13549().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14494Test : StringSpec({
    "다이나믹이 뭐예요? : https://www.acmicpc.net/problem/14494" {
        val testCases = listOf(
            "3 2" to "5",
            "4 5" to "129",
            "1000 1000" to "910657857",
        )

        testCases.forEach { (given, expected) ->

            No14494().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

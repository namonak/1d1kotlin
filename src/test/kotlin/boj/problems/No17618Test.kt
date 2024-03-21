package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17618Test : StringSpec({
    "신기한 수 : https://www.acmicpc.net/problem/17618" {
        val testCases = listOf(
            "9" to "9",
            "21" to 14
        )

        testCases.forEach { (given, expected) ->
            No17618().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

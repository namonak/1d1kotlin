package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26307Test : StringSpec({
    "Correct : https://www.acmicpc.net/problem/26307" {
        val testCases = listOf(
            "9 0" to "0",
            "11 59" to "179"
        )

        testCases.forEach { (given, expected) ->
            No26307().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

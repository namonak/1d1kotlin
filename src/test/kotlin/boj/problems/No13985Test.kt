package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13985Test : StringSpec({
    "Equality : https://www.acmicpc.net/problem/13985" {
        val testCases = listOf(
            "1 + 2 = 3" to "YES",
            "2 + 2 = 5" to "NO"
        )

        testCases.forEach { (given, expected) ->
            No13985().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1065Test : StringSpec({
    "한수 : https://www.acmicpc.net/problem/1065" {
        val testCases = listOf(
            "110" to "99",
            "1" to "1",
            "210" to "105",
            "1000" to "144",
            "500" to "119",
        )

        testCases.forEach { (given, expected) ->
            No1065().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27294Test : StringSpec({
    "몇개고? : https://www.acmicpc.net/problem/27294" {
        val testCases = listOf(
            "16 0" to "320",
            "14 1" to "280",
            "17 0" to "280",
            "10 1" to "280",
            "10 0" to "280"
        )

        testCases.forEach { (given, expected) ->
            val actual = No27294().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})

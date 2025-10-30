package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30310Test : StringSpec({
    "Finding Forks : https://www.acmicpc.net/problem/30310" {
        val testCases = listOf(
            """
                3
                4 9 5
            """.trimIndent() to "9",
            """
                10
                18 39 5 12 1000000000 54 23 11 123 31415
            """.trimIndent() to "16"
        )

        testCases.forEach { (given, expected) ->
            No30310().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

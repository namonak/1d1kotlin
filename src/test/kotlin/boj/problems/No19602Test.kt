package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No19602Test : StringSpec({
    "Dog Treats : https://www.acmicpc.net/problem/19602" {
        val testCases = listOf(
            """
                3
                1
                0
            """.trimIndent() to "sad",
            """
                3
                2
                1
            """.trimIndent() to "happy"
        )

        testCases.forEach { (given, expected) ->
            No19602().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

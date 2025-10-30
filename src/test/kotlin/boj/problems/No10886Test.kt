package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10886Test : StringSpec({
    "0 = not cute / 1 = cute : https://www.acmicpc.net/problem/10886" {
        val testCases = listOf(
            """
                3
                1
                0
                0
            """.trimIndent()
                to "Junhee is not cute!",
            """
                5
                1
                1
                1
                1
                0
            """.trimIndent()
                to "Junhee is cute!",
            """
                4
                1
                1
                0
                0
            """.trimIndent()
                to "Junhee is not cute!",
        )

        testCases.forEach { (given, expected) ->
            No10886().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

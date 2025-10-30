package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10797Test : StringSpec({
    "10부제 : https://www.acmicpc.net/problem/10797" {
        val testCases = listOf(
            """
                1
                1 2 3 4 5
            """.trimIndent()
                to "1",
            """
                3
                1 2 3 5 3
            """.trimIndent()
                to "2",
            """
                5
                1 3 0 7 4
            """.trimIndent()
                to "0"
        )

        testCases.forEach { (given, expected) ->
            No10797().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

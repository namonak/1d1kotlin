package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1822Test : StringSpec({
    "차집합 : https://www.acmicpc.net/problem/1822" {
        val testCases = listOf(
            """
                4 3
                2 5 11 7
                9 7 4
            """.trimIndent() to """
                3
                2 5 11
            """.trimIndent(),
            """
                3 5
                2 5 4
                1 2 3 4 5
            """.trimIndent() to """
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No1822().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

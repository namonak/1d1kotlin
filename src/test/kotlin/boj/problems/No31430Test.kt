package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31430Test : StringSpec({
    "A+B - 투 스텝 : https://www.acmicpc.net/problem/31430" {
        val testCases = listOf(
            """
                1
                1 2
            """.trimIndent() to "aaaaaaaathree",
            """
                2
                aaaaaaaathree
            """.trimIndent() to "3"
        )

        testCases.forEach { (given, expected) ->
            No31430().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

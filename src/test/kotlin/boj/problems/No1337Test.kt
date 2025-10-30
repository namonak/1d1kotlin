package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1337Test : StringSpec({
    "올바른 배열 : https://www.acmicpc.net/problem/1337" {
        val testCases = listOf(
            """
                3
                5
                6
                7
            """.trimIndent() to "2",
            """
                6
                5
                7
                9
                8492
                8493
                192398
            """.trimIndent() to "2",
            """
                4
                1000
                2000
                3000
                4000
            """.trimIndent() to "4",
            """
                7
                6
                1
                9
                5
                7
                15
                8
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No1337().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

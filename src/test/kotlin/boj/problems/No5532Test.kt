package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5532Test : StringSpec({
    "방학 숙제 : https://www.acmicpc.net/problem/5532" {
        val testCases = listOf(
            """
                20
                25
                30
                6
                8
            """.trimIndent()
                to "15",
            """
                15
                32
                48
                4
                6
            """.trimIndent()
                to "7"
        )

        testCases.forEach { (given, expected) ->
            No5532().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

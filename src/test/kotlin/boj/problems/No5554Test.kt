package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5554Test : StringSpec({
    "심부름 가는 길 : https://www.acmicpc.net/problem/5554" {
        val testCases = listOf(
            """
                31
                34
                7
                151
            """.trimIndent()
                to """
                    3
                    43
                """.trimIndent(),
            """
                316
                430
                643
                1253
            """.trimIndent()
                to """
                    44
                    2
                """.trimIndent(),
            """
                5
                10
                15
                30
            """.trimIndent()
                to """
                    1
                    0
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No5554().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

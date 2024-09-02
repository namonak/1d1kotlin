package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3040Test : StringSpec({
    "백설 공주와 일곱 난쟁이 : https://www.acmicpc.net/problem/3040" {
        val testCases = listOf(
            """
                7
                8
                10
                13
                15
                19
                20
                23
                25
            """.trimIndent() to """
                7
                8
                10
                13
                19
                20
                23
            """.trimIndent(),
            """
                8
                6
                5
                1
                37
                30
                28
                22
                36
            """.trimIndent() to """
                8
                6
                5
                1
                30
                28
                22
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No3040().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

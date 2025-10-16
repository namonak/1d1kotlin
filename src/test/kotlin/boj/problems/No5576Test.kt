package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5576Test : StringSpec({
    "콘테스트 : https://www.acmicpc.net/problem/5576" {
        val testCases = listOf(
            """
                23
                23
                20
                15
                15
                14
                13
                9
                7
                6
                25
                19
                17
                17
                16
                13
                12
                11
                9
                5
            """.trimIndent() to "66 61",
            """
                17
                25
                23
                25
                79
                29
                1
                61
                59
                100
                44
                74
                94
                57
                13
                54
                82
                0
                42
                45
            """.trimIndent() to "240 250"
        )

        testCases.forEach { (input, output) ->
            val actual = No5576().solve(BufferedReader(input.reader()))
            actual shouldBe output
        }
    }
})

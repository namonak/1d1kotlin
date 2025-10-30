package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1051Test : StringSpec({
    "숫자 정사각형 : https://www.acmicpc.net/problem/1051" {
        val testCases = listOf(
            """
                3 5
                42101
                22100
                22101
            """.trimIndent() to "9",
            """
                2 2
                12
                34
            """.trimIndent() to "1",
            """
                2 4
                1255
                3455
            """.trimIndent() to "4",
            """
                1 10
                1234567890
            """.trimIndent() to "1",
            """
                11 10
                9785409507
                2055103694
                0861396761
                3073207669
                1233049493
                2300248968
                9769239548
                7984130001
                1670020095
                8894239889
                4053971072
            """.trimIndent() to "49"
        )

        testCases.forEach { (input, expected) ->
            No1051().solve(input.reader().buffered()) shouldBe expected
        }
    }
})

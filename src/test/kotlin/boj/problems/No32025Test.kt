package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No32025Test : StringSpec({
    "체육은 수학과목 입니다 : https://www.acmicpc.net/problem/32025" {
        val testCases = listOf(
            """
                8
                10
            """.trimIndent() to "400",
            """
                5
                13
            """.trimIndent() to "250"
        )

        testCases.forEach { (given, expected) ->
            No32025().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

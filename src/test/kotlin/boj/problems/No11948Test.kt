package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11948Test : StringSpec({
    "과목선택  : https://www.acmicpc.net/problem/11948" {
        val testCases = listOf(
            """
                100
                34
                76
                42
                10
                0
            """.trimIndent() to "228",
            """
                15
                21
                15
                42
                15
                62
            """.trimIndent() to "140"
        )

        testCases.forEach { (given, expected) ->
            No11948().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

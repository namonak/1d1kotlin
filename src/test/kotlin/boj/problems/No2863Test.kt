package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2863Test : StringSpec({
    "이게 분수? : https://www.acmicpc.net/problem/2863" {
        val testCases = listOf(
            """
                1 2
                3 4
            """.trimIndent() to "2",
            """
                5 9
                7 2
            """.trimIndent() to "0",
            """
                41 99
                100 13
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No2863().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

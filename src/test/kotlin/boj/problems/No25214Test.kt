package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25214Test : StringSpec({
    "크림 파스타 : https://www.acmicpc.net/problem/25214" {
        val testCases = listOf(
            """
                6
                50 100 70 110 10 100
            """.trimIndent() to "0 50 50 60 60 90",
            """
                6
                3 3 2 8 3 1000000000
            """.trimIndent() to "0 0 0 6 6 999999998"
        )

        testCases.forEach { (given, expected) ->
            No25214().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

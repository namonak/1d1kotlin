package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No33572Test : StringSpec({
    "자세히 보아야 예쁘다 : https://www.acmicpc.net/problem/33572" {
        val testCases = listOf(
            """
                3 7
                3 3 3
            """.trimIndent() to "OUT",
            """
                3 6
                3 3 3
            """.trimIndent() to "DIMI"
        )

        testCases.forEach { (given, expected) ->
            No33572().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

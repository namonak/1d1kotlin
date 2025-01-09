package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15881Test : StringSpec({
    "Pen Pineapple Apple Pen : https://www.acmicpc.net/problem/15881" {
        val testCases = listOf(
            """
                15
                ApPApPpAPpApPAp
            """.trimIndent() to "2",
            """
                7
                pPApPAp
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No15881().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25497Test : StringSpec({
    "기술 연계마스터 임스 : https://www.acmicpc.net/problem/25497" {
        val testCases = listOf(
            """
                5
                S12K2
            """.trimIndent() to "4",
            """
                4
                1LKR
            """.trimIndent() to "1",
            """
                4
                SSKK
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No25497().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

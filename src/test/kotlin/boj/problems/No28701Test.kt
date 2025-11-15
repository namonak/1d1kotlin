package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28701Test : StringSpec({
    "세제곱의 합 : https://www.acmicpc.net/problem/28701" {
        val testCases = listOf(
            "5" to """
                15
                225
                225
            """.trimIndent(),
            "100" to """
                5050
                25502500
                25502500
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            No28701().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

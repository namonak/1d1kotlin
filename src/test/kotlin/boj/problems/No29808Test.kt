package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29808Test : StringSpec({
    "너의 수능 점수가 궁금해 : https://www.acmicpc.net/problem/29808" {
        val testCases = listOf(
            "9709171" to """
                0
            """.trimIndent(),
            "457819560" to """
                3
                107 197
                160 70
                170 32
            """.trimIndent(),
            "96807975" to """
                2
                25 25
                95 33
            """.trimIndent()
        )

        testCases.forEach { (input, expected) ->
            No29808().solve(input.reader().buffered()) shouldBe expected
        }
    }
})

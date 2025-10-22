package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1977Test : StringSpec({
    "완전제곱수 : https://www.acmicpc.net/problem/1977" {
        val testCases = listOf(
            """
                60
                100
            """.trimIndent() to """
                245
                64
            """.trimIndent(),
            """
                75
                80
            """.trimIndent() to """
                -1
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No1977().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No19637Test : StringSpec({
    "IF문 좀 대신 써줘 : https://www.acmicpc.net/problem/19637" {
        val testCases = listOf(
            """
                3 8
                WEAK 10000
                NORMAL 100000
                STRONG 1000000
                0
                9999
                10000
                10001
                50000
                100000
                500000
                1000000
            """.trimIndent() to """
                WEAK
                WEAK
                WEAK
                NORMAL
                NORMAL
                NORMAL
                STRONG
                STRONG
            """.trimIndent(),
            """
                3 5
                B 100
                A 100
                C 1000
                99
                100
                101
                500
                1000
            """.trimIndent() to """
                B
                B
                C
                C
                C
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No19637().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

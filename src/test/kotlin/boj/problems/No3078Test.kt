package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3078Test : StringSpec({
    "좋은 친구 : https://www.acmicpc.net/problem/3078" {
        val testCases = listOf(
            """
                4 2
                IVA
                IVO
                ANA
                TOM
            """.trimIndent() to "5",
            """
                6 3
                CYNTHIA
                LLOYD
                STEVIE
                KEVIN
                MALCOLM
                DABNEY
            """.trimIndent() to "2"
        )

        for ((given, expected) in testCases) {
            No3078().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

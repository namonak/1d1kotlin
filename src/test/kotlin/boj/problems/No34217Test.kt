package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No34217Test : StringSpec({
    "찾아오시는 길 : https://www.acmicpc.net/problem/34217" {
        val testCases = listOf(
            """
                66 71
                19 18
            """.trimIndent() to "Hanyang Univ.",
            """
                16 7
                11 13
            """.trimIndent() to "Yongdap",
            """
                31 33
                17 15
            """.trimIndent() to "Either"
        )

        for ((given, expected) in testCases) {
            No34217().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

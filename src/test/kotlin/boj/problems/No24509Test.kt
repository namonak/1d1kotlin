package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24509Test : StringSpec({
    "상품의 주인은? : https://www.acmicpc.net/problem/24509" {
        val testCases = listOf(
            """
                4
                1 49 81 74 66
                2 88 70 91 38
                3 94 80 85 79
                4 91 27 44 60
            """.trimIndent() to "3 1 2 4",
            """
                8
                3 65 21 8 61
                8 69 2 19 58
                7 85 40 42 29
                4 45 1 58 56
                2 4 37 83 33
                6 75 60 12 42
                5 80 20 74 49
                1 8 26 93 33
            """.trimIndent() to "7 6 1 3"
        )

        for ((given, expected) in testCases) {
            No24509().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

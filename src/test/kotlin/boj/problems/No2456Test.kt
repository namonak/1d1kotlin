package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2456Test : StringSpec({
    "나는 학급회장이다 : https://www.acmicpc.net/problem/2456" {
        val testCases = listOf(
            """
                6
                3 1 2
                2 3 1
                3 1 2
                1 2 3
                3 1 2
                1 2 3
            """.trimIndent() to "1 13",
            """
                6
                1 2 3
                3 1 2
                2 3 1
                1 2 3
                3 1 2
                2 3 1
            """.trimIndent() to "0 12"
        )

        testCases.forEach { (given, expected) ->
            No2456().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

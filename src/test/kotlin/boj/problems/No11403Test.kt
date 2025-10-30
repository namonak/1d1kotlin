package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11403Test : StringSpec({
    "경로 찾기 : https://www.acmicpc.net/problem/11403" {
        val testCases = listOf(
            """
                3
                0 1 0
                0 0 1
                1 0 0
            """.trimIndent() to """
                1 1 1
                1 1 1
                1 1 1
            """.trimIndent(),
            """
                7
                0 0 0 1 0 0 0
                0 0 0 0 0 0 1
                0 0 0 0 0 0 0
                0 0 0 0 1 1 0
                1 0 0 0 0 0 0
                0 0 0 0 0 0 1
                0 0 1 0 0 0 0
            """.trimIndent() to """
                1 0 1 1 1 1 1
                0 0 1 0 0 0 1
                0 0 0 0 0 0 0
                1 0 1 1 1 1 1
                1 0 1 1 1 1 1
                0 0 1 0 0 0 1
                0 0 1 0 0 0 0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No11403().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

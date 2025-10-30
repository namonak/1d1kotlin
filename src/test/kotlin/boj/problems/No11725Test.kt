package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11725Test : StringSpec({
    "트리의 부모 찾기 : https://www.acmicpc.net/problem/11725" {
        val testCases = listOf(
            """
                7
                1 6
                6 3
                3 5
                4 1
                2 4
                4 7
            """.trimIndent() to """
                4
                6
                1
                3
                1
                4
            """.trimIndent(),
            """
                12
                1 2
                1 3
                2 4
                3 5
                3 6
                4 7
                4 8
                5 9
                5 10
                6 11
                6 12
            """.trimIndent() to """
                1
                1
                2
                3
                3
                4
                4
                5
                5
                6
                6
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No11725().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

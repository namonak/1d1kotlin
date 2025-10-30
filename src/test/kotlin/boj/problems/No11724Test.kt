package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11724Test : StringSpec({
    "연결 요소의 개수 : https://www.acmicpc.net/problem/11724" {
        val testCases = listOf(
            """
                6 5
                1 2
                2 5
                5 1
                3 4
                4 6
            """.trimIndent()
                to "2",
            """
                6 8
                1 2
                2 5
                5 1
                3 4
                4 6
                5 4
                2 4
                2 3
            """.trimIndent()
                to "1"
        )

        testCases.forEach { (given, expected) ->
            No11724().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

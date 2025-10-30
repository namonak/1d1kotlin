package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2865Test : StringSpec({
    "나는 위대한 슈퍼스타K : https://www.acmicpc.net/problem/2865" {
        val testCases = listOf(
            """
                3 2 2
                2 3.0 1 0.2 3 0.1
                3 1.0 2 0.5 1 0.2
            """.trimIndent() to "4.0",
            """
                4 4 3
                4 5.0 2 4.0 3 2.0 1 1.0
                2 2.0 3 1.0 1 0.5 4 0.3
                4 6.0 3 5.0 2 2.0 1 0.0
                1 4.0 2 3.0 4 0.6 3 0.3
            """.trimIndent() to "15.0"
        )

        testCases.forEach { (given, expected) ->
            No2865().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29736Test : StringSpec({
    "브실이와 친구가 되고 싶어 : https://www.acmicpc.net/problem/29736" {
        val testCases = listOf(
            """
                10 100
                50 10
            """.trimIndent() to "21",
            """
                25 75
                10 5
            """.trimIndent() to "IMPOSSIBLE"
        )

        testCases.forEach { (given, expected) ->
            No29736().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

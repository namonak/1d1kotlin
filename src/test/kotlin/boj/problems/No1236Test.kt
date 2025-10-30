package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1236Test : StringSpec({
    "성 지키기 : https://www.acmicpc.net/problem/1236" {
        val testCases = listOf(
            """
                4 4
                ....
                ....
                ....
                ....
            """.trimIndent() to "4",
            """
                3 5
                XX...
                .XX..
                ...XX
            """.trimIndent() to "0",
            """
                5 8
                ....XXXX
                ........
                XX.X.XX.
                ........
                ........
            """.trimIndent() to "3"
        )

        testCases.forEach { (given, expected) ->
            No1236().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

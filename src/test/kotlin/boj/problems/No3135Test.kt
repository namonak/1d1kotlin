package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3135Test : StringSpec({
    "라디오 : https://www.acmicpc.net/problem/3135" {
        val testCases = listOf(
            """
                100 15
                1
                15
            """.trimIndent()
                to "1",
            """
                88 17
                3
                18
                1
                42
            """.trimIndent()
                to "2",
            """
                64 120
                1
                567
            """.trimIndent()
                to "56"
        )

        testCases.forEach { (given, expected) ->
            No3135().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

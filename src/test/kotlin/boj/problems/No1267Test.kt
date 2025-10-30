package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1267Test : StringSpec({
    "핸드폰 요금 : https://www.acmicpc.net/problem/1267" {
        val testCases = listOf(
            """
                3
                40 40 40
            """.trimIndent() to "M 45",
            """
                3
                61 61 61
            """.trimIndent() to "Y M 90",
            """
                2
                61 10
            """.trimIndent() to "Y 40",
            """
                2
                60 65
            """.trimIndent() to "Y M 60"
        )

        testCases.forEach { (given, expected) ->
            No1267().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

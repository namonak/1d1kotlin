package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10833Test : StringSpec({
    "사과 : https://www.acmicpc.net/problem/10833" {
        val testCases = listOf(
            """
                5
                24 52
                13 22
                5 53
                23 10
                7 70
            """.trimIndent() to "26",
            """
                3
                10 20
                5 5
                1 13
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            val actual = No10833().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})

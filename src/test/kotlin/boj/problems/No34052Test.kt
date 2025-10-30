package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No34052Test : StringSpec({
    "체육은 수학과목 입니다 2 : https://www.acmicpc.net/problem/34052" {
        val testCases = listOf(
            """
                375
                375
                375
                375
            """.trimIndent() to "Yes",
            """
                375
                375
                375
                400
            """.trimIndent() to "No",
            """
                300
                300
                300
                300
            """.trimIndent() to "Yes",
        )

        testCases.forEach { (given, expected) ->
            val result = No34052().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})

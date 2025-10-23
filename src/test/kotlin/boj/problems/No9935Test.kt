package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9935Test : StringSpec({
    "문자열 폭발 : https://www.acmicpc.net/problem/9935" {
        val testCases = listOf(
            """
                mirkovC4nizCC44
                C4
            """.trimIndent() to "mirkovniz",
            """
                12ab112ab2ab
                12ab
            """.trimIndent() to "FRULA",
        )

        testCases.forEach { (given, expected) ->
            No9935().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

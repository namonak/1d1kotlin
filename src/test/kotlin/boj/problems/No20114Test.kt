package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20114Test : StringSpec({
    "미아 노트 : https://www.acmicpc.net/problem/20114" {
        val testCases = listOf(
            """
                3 2 2
                a?????
                ???bcc
            """.trimIndent() to "abc",
            """
                6 2 3
                ???rrruuu???ttt???
                f?f?rruuu?????t???
            """.trimIndent() to "fru?t?"
        )

        testCases.forEach { (given, expected) ->
            No20114().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

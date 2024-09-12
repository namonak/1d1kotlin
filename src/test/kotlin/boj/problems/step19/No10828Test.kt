package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10828Test : StringSpec({
    "스택 : https://www.acmicpc.net/problem/10828" {
        val testCases = listOf(
            """
                14
                push 1
                push 2
                top
                size
                empty
                pop
                pop
                pop
                size
                empty
                pop
                push 3
                empty
                top
            """.trimIndent() to """
                2
                2
                0
                2
                1
                -1
                0
                1
                -1
                0
                3
            """.trimIndent(),
            """
                7
                pop
                top
                push 123
                top
                pop
                top
                pop
            """.trimIndent() to """
                -1
                -1
                123
                123
                -1
                -1
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No10828().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

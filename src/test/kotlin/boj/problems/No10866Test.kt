package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10866Test : StringSpec({
    "덱 : https://www.acmicpc.net/problem/10866" {
        val testCases = listOf(
            """
                15
                push_back 1
                push_front 2
                front
                back
                size
                empty
                pop_front
                pop_back
                pop_front
                size
                empty
                pop_back
                push_front 3
                empty
                front
            """.trimIndent() to
                """
                2
                1
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
                22
                front
                back
                pop_front
                pop_back
                push_front 1
                front
                pop_back
                push_back 2
                back
                pop_front
                push_front 10
                push_front 333
                front
                back
                pop_back
                pop_back
                push_back 20
                push_back 1234
                front
                back
                pop_back
                pop_back
            """.trimIndent() to
                """
                -1
                -1
                -1
                -1
                1
                1
                2
                2
                333
                10
                10
                333
                20
                1234
                1234
                20
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No10866().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No23746Test : StringSpec({
    "문자열 압축 해제 : https://www.acmicpc.net/problem/23746" {
        val testCases = listOf(
            """
                3
                aa A
                bba B
                c C
                ABAC
                4 6
            """.trimIndent() to "baa",
            """
                5
                abcde A
                abcde B
                abcde C
                abcde D
                abcde E
                ABCDE
                1 25
            """.trimIndent() to "abcdeabcdeabcdeabcdeabcde",
            """
                4
                e E
                f F
                g G
                h H
                EEEFEEE
                4 5
            """.trimIndent() to "fe"
        )

        testCases.forEach { (given, expected) ->
            No23746().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

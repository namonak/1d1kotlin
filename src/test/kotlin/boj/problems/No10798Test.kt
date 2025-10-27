package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10798Test : StringSpec({
    "세로읽기 : https://www.acmicpc.net/problem/10798" {
        val testCases = listOf(
            """
                ABCDE
                abcde
                01234
                FGHIJ
                fghij
            """.trimIndent() to "Aa0FfBb1GgCc2HhDd3IiEe4Jj",
            """
                AABCDD
                afzz
                09121
                a8EWg6
                P5h3kx
            """.trimIndent() to "Aa0aPAf985Bz1EhCz2W3D1gkD6x"
        )

        testCases.forEach { (given, expected) ->
            No10798().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

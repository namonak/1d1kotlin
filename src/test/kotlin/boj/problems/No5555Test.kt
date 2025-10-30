package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5555Test : StringSpec({
    "반지 : https://www.acmicpc.net/problem/5555" {
        val testCases = listOf(
            """
                ABCD
                3
                ABCDXXXXXX
                YYYYABCDXX
                DCBAZZZZZZ
            """.trimIndent() to "2",
            """
                XYZ
                1
                ZAAAAAAAXY
            """.trimIndent() to "1",
            """
                PQR
                3
                PQRAAAAPQR
                BBPQRBBBBB
                CCCCCCCCCC
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No5555().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

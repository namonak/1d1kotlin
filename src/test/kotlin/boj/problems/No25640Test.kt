package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25640Test : StringSpec({
    "MBTI : https://www.acmicpc.net/problem/25640" {
        val testCases = listOf(
            """
                ESTJ
                5
                ISTP
                ESTJ
                INTP
                ESTJ
                ENTJ
            """.trimIndent()
                to "2",
            """
               INTP
               6
               INTP
               INTP
               ESFP
               ISFP
               INFP
               INTP
            """.trimIndent()
                to "3"
        )

        testCases.forEach { (given, expected) ->
            No25640().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

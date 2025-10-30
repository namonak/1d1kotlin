package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1543Test : StringSpec({
    "문서 검색 : https://www.acmicpc.net/problem/1543" {
        val testCases = listOf(
            """
                ababababa
                aba
            """.trimIndent() to "2",
            """
                a a a a a
                a a
            """.trimIndent() to "2",
            """
                ababababa
                ababa
            """.trimIndent() to "1",
            """
                aaaaaaa
                aa
            """.trimIndent() to "3"
        )

        testCases.forEach { (given, expected) ->
            No1543().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

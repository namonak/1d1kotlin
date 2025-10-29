package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16916Test : StringSpec({
    "부분 문자열 : https://www.acmicpc.net/problem/16916" {
        val testCases = listOf(
            """
                baekjoon
                aek
            """.trimIndent() to "1",
            """
                baekjoon
                bak
            """.trimIndent() to "0",
            """
                baekjoon
                joo
            """.trimIndent() to "1",
            """
                baekjoon
                oone
            """.trimIndent() to "0",
            """
                baekjoon
                online
            """.trimIndent() to "0",
            """
                baekjoon
                baekjoon
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No16916().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

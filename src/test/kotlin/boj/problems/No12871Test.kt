package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12871Test : StringSpec({
    "무한 문자열 : https://www.acmicpc.net/problem/12871" {
        val testCases = listOf(
            """
                ab
                abab
            """.trimIndent() to "1",
            """
                abc
                bca
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No12871().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

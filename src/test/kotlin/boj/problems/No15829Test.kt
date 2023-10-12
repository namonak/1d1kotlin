package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15829Test : StringSpec({
    "Hashing : https://www.acmicpc.net/problem/15829" {
        val testCases = listOf(
            """
                5
                abcde
            """.trimIndent()
                to "4739715",
            """
                3
                zzz
            """.trimIndent()
                to "25818",
            """
                1
                i
            """.trimIndent()
                to "9"
        )

        testCases.forEach { (given, expected) ->
            No15829.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

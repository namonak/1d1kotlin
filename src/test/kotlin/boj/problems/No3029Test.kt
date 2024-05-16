package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3029Test : StringSpec({
    "경고 : https://www.acmicpc.net/problem/3029" {
        val testCases = listOf(
            """
                20:00:00
                04:00:00
            """.trimIndent() to "08:00:00",
            """
                12:34:56
                14:36:22
            """.trimIndent() to "02:01:26"
        )

        testCases.forEach { (given, expected) ->
            No3029().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

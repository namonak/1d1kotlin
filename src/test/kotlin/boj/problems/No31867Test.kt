package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31867Test : StringSpec({
    "홀짝홀짝 : https://www.acmicpc.net/problem/31867" {
        val testCases = listOf(
            """
                9
                123456789
            """.trimIndent() to "1",
            """
                7
                1234568
            """.trimIndent() to "0",
            """
                8
                12345678
            """.trimIndent() to "-1"
        )

        testCases.forEach { (given, expected) ->
            No31867().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

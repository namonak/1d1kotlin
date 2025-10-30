package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15813Test : StringSpec({
    "너의 이름은 몇 점이니? : https://www.acmicpc.net/problem/15813" {
        val testCases = listOf(
            """
                7
                SUNGPIL
            """.trimIndent() to "98",
            """
                6
                SOYOON
            """.trimIndent() to "103"
        )

        testCases.forEach { (given, expected) ->
            No15813().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

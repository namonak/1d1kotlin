package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1076Test : StringSpec({
    "저항 : https://www.acmicpc.net/problem/1076" {
        val testCases = listOf(
            """
                yellow
                violet
                red
            """.trimIndent() to "4700",
            """
                orange
                red
                blue
            """.trimIndent() to "32000000",
            """
                white
                white
                white
            """.trimIndent() to "99000000000",
        )

        testCases.forEach { (given, expected) ->
            No1076().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32297Test : StringSpec({
    "문자열을 만들어요 : https://www.acmicpc.net/problem/32297" {
        val testCases = listOf(
            """
                9
                algorithm
            """.trimIndent() to "YES",
            """
                8
                ggoorrii
            """.trimIndent() to "NO"
        )

        testCases.forEach { (given, expected) ->
            No32297().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

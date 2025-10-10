package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14487Test : StringSpec({
    "욱제는 효도쟁이야!! : https://www.acmicpc.net/problem/14487" {
        val testCases = listOf(
            """
                5
                1 6 5 2 4
            """.trimIndent() to "12",
            """
                4
                100 100 100 101
            """.trimIndent() to "300"
        )

        testCases.forEach { (given, expected) ->
            No14487().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

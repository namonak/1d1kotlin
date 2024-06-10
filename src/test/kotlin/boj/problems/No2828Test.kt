package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2828Test : StringSpec({
    "사과 담기 게임 : https://www.acmicpc.net/problem/2828" {
        val testCases = listOf(
            """
                5 1
                3
                1
                5
                3
            """.trimIndent() to "6",
            """
                5 2
                3
                1
                5
                3
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            No2828().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

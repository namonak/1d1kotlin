package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5522Test : StringSpec({
    "카드 게임 : https://www.acmicpc.net/problem/5522" {
        val testCases = listOf(
            """
                1
                2
                3
                4
                5
            """.trimIndent()
                to "15",
            """
                0
                100
                0
                10
                100
            """.trimIndent()
                to "210"
        )

        testCases.forEach { (given, expected) ->
            No5522.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

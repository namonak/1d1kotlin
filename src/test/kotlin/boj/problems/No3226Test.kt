package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3226Test : StringSpec({
    "전화 요금 : https://www.acmicpc.net/problem/3226" {
        val testCases = listOf(
            """
                2
                11:02 11
                15:30 01
            """.trimIndent() to "120",
            """
                3
                20:05 12
                06:45 30
                13:08 15
            """.trimIndent() to "435",
            """
                5
                00:00 05
                06:47 35
                11:30 18
                18:33 60
                23:59 22
            """.trimIndent() to "1035"
        )

        testCases.forEach { (given, expected) ->
            val result = No3226().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})

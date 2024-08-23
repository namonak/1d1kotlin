package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30045Test : StringSpec({
    "ZOAC 6 : https://www.acmicpc.net/problem/30045" {
        val testCases = listOf(
            """
                4
                zoacisgoodcontest
                2018to2023
                hello
                JOIN
            """.trimIndent() to "2",
            """
                4
                SPOILER
                HARD
                OI01OI
                OioioI
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No30045().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})

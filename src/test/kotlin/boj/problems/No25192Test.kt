package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25192Test : StringSpec({
    "인사성 밝은 곰곰이 : https://www.acmicpc.net/problem/25192" {
        val testCases = listOf(
            """
                9
                ENTER
                pjshwa
                chansol
                chogahui05
                lms0806
                pichulia
                r4pidstart
                swoon
                tony9402
            """.trimIndent() to "8",
            """
                7
                ENTER
                pjshwa
                chansol
                chogahui05
                ENTER
                pjshwa
                chansol
            """.trimIndent() to "5",
            """
                3
                ENTER
                lms0806
                lms0806
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            val actual = No25192().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})

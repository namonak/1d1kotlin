package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11536Test : StringSpec({
    "줄 세우기 : https://www.acmicpc.net/problem/11536" {
        val testCases = listOf(
            """
                5
                JOE
                BOB
                ANDY
                AL
                ADAM
            """.trimIndent() to "DECREASING",
            """
                11
                HOPE
                ALI
                BECKY
                JULIE
                MEGHAN
                LAUREN
                MORGAN
                CARLI
                MEGAN
                ALEX
                TOBIN
            """.trimIndent() to "NEITHER"
        )

        testCases.forEach { (given, expected) ->
            No11536().solve(given.reader().buffered()) shouldBe expected
        }
    }
})

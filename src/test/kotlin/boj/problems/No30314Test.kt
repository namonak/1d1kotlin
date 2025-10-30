package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30314Test : StringSpec({
    "Just a Joystick : https://www.acmicpc.net/problem/30314" {
        val testCases = listOf(
            """
                3
                RGK
                MPS
            """.trimIndent() to "22",
            """
                5
                ABIYZ
                YZIAB
            """.trimIndent() to "8"
        )

        testCases.forEach { (given, expected) ->
            val result = No30314().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})

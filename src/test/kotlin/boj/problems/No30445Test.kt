package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No30445Test : StringSpec({
    "행복 점수 : https://www.acmicpc.net/problem/30445" {
        val testCases = listOf(
            "SAD MOVIES ALWAYS MAKE ME CRY" to "42.86",
            "ICPC PROGRAMMING" to "75.00",
            "WRITING" to "50.00"
        )

        testCases.forEach { (given, expected) ->
            val result = No30445().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No33571Test : StringSpec({
    "구멍 : https://www.acmicpc.net/problem/33571" {
        val testCases = listOf(
            "dimigo is the best high school @" to "10",
            "BBBBBB" to "12"
        )

        testCases.forEach { (given, expected) ->
            val result = No33571().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})

package boj.problems.step10

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15894Test : StringSpec({
    "수학은 체육과목 입니다 : https://www.acmicpc.net/problem/15894" {
        val testCases = listOf(
            1L to 4L,
            2L to 8L,
            3L to 12L,
            4L to 16L,
            100L to 400L
        )

        testCases.forEach { (given, expected) ->
            val actual = No15894.solve(given)

            actual shouldBe expected
        }
    }
})

package boj.problems.step23

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24416Test : StringSpec({
    "알고리즘 수업 - 피보나치 수 1 : https://www.acmicpc.net/problem/24416" {
        val testCases = listOf(
            5 to "5 3",
            30 to "832040 28"
        )

        testCases.forEach { (given, expected) ->
            val actual = No24416.solve(given)

            actual shouldBe expected
        }
    }
})

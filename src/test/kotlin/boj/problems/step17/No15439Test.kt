package boj.problems.step17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15439Test : StringSpec({
    "베라의 패션 : https://www.acmicpc.net/problem/15439" {
        val testCases = listOf(
            1 to 0,
            2 to 2,
            3 to 6,
            5 to 20,
            10 to 90,
            100 to 9900,
        )

        testCases.forEach { (given, expected) ->
            val actual = No15439.solve(given)

            actual shouldBe expected
        }
    }
})

package boj.problems.step3

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No1110Test : StringSpec({
    "더하기 사이클 테스트" {
        println("더하기 사이클 : https://www.acmicpc.net/problem/1110")

        val testCases = arrayOf(
            row(26, 4),
            row(55, 3),
            row(1, 60),
            row(0, 1),
            row(71, 12)
        )

        testCases.forEach { (given, expected) ->
            val actual = No1110.solve(given)

            actual shouldBe expected
        }
    }
})

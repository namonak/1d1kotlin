package boj.problems.step21

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27433Test : StringSpec({
    "팩토리얼 2 : https://www.acmicpc.net/problem/27433" {
        val testCases = listOf(
            10L to 3628800L,
            0L to 1L,
            20L to 2432902008176640000L
        )

        testCases.forEach { (given, expected) ->
            val actual = No27433.solve(given)
            actual shouldBe expected
        }
    }
})

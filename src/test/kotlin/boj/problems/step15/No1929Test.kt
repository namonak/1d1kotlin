package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1929Test : StringSpec({
    "소수 구하기 : https://www.acmicpc.net/problem/1929" {
        // given
        val input = "3 16"
        val output = """
            3
            5
            7
            11
            13
        """.trimIndent()

        val actual = No1929.solve(input)

        actual shouldBe output
    }
})

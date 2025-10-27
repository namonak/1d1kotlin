package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1929Test : StringSpec({
    "소수 구하기 : https://www.acmicpc.net/problem/1929" {
        val input = "3 16"
        val output = """
            3
            5
            7
            11
            13
        """.trimIndent()

        No1929().solve(input.reader().buffered()) shouldBe output
    }
})

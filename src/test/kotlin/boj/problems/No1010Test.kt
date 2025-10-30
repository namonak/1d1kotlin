package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1010Test : StringSpec({
    "다리 놓기 : https://www.acmicpc.net/problem/1010" {
        val given = """
            3
            2 2
            1 5
            13 29
        """.trimIndent()
        val expected = """
            1
            5
            67863915
        """.trimIndent()

        No1010().solve(given.reader().buffered()) shouldBe expected
    }
})

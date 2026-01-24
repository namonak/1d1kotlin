package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2615Test : StringSpec({
    "오목 : https://www.acmicpc.net/problem/2615" {
        val given = """
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 1 2 0 0 2 2 2 1 0 0 0 0 0 0 0 0 0 0
            0 0 1 2 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0
            0 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 1 2 2 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 2 1 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        """.trimIndent()
        val expected = """
            1
            3 2
        """.trimIndent()

        No2615().solve(given.reader().buffered()) shouldBe expected
    }
})

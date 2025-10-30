package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1780Test : StringSpec({
    "종이의 개수 : https://www.acmicpc.net/problem/1780" {
        val given = """
            9
            0 0 0 1 1 1 -1 -1 -1
            0 0 0 1 1 1 -1 -1 -1
            0 0 0 1 1 1 -1 -1 -1
            1 1 1 0 0 0 0 0 0
            1 1 1 0 0 0 0 0 0
            1 1 1 0 0 0 0 0 0
            0 1 -1 0 1 -1 0 1 -1
            0 -1 1 0 1 -1 0 1 -1
            0 1 -1 1 0 -1 0 1 -1
        """.trimIndent()
        val expected = """
            10
            12
            11
        """.trimIndent()

        No1780().solve(given.reader().buffered()) shouldBe expected
    }
})

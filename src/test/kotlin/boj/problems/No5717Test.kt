package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5717Test : StringSpec({
    "상근이의 친구들 : https://www.acmicpc.net/problem/5717" {
        val given = """
            2 2
            2 3
            5 5
            1 1
            0 0
        """.trimIndent()
        val expected = """
            4
            5
            10
            2
        """.trimIndent()

        No5717().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1485Test : StringSpec({
    "정사각형 : https://www.acmicpc.net/problem/1485" {
        val given = """
            2
            1 1
            1 2
            2 1
            2 2
            2 2
            3 3
            4 4
            5 5
        """.trimIndent()
        val expected = """
            1
            0
        """.trimIndent()

        No1485().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6322Test : StringSpec({
    "직각 삼각형의 두 변 : https://www.acmicpc.net/problem/6322" {
        val given = """
            3 4 -1
            -1 2 7
            5 -1 3
            0 0 0
        """.trimIndent()
        val expected = """
            Triangle #1
            c = 5.000

            Triangle #2
            a = 6.708

            Triangle #3
            Impossible.
        """.trimIndent()

        No6322().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

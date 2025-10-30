package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2167Test : StringSpec({
    "2차원 배열의 합 : https://www.acmicpc.net/problem/2167" {
        val given = """
            2 3
            1 2 4
            8 16 32
            3
            1 1 2 3
            1 2 1 2
            1 3 2 3
        """.trimIndent()
        val expected = """
            63
            2
            36
        """.trimIndent()

        No2167().solve(given.reader().buffered()) shouldBe expected
    }
})

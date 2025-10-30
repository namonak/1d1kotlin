package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4884Test : StringSpec({
    "FIFA 월드컵 : https://www.acmicpc.net/problem/4884" {
        val given = """
            8 4 2 0
            8 4 2 1
            -1 -1 -1 -1
        """.trimIndent()
        val expected = """
            8*2/4+0=63+0
            8*2/4+1=79+15
        """.trimIndent()

        No4884().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3063Test : StringSpec({
    "게시판 : https://www.acmicpc.net/problem/3063" {
        val given = """
            3
            2 3 5 8 4 7 6 10
            1 1 5 5 2 2 4 4
            2 2 4 4 1 1 5 5
        """.trimIndent()
        val expected = """
            14
            12
            0
        """.trimIndent()

        val result = No3063().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

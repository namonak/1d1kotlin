package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2667Test : StringSpec({
    "단지번호붙이기 : https://www.acmicpc.net/problem/2667" {
        val given = """
            7
            0110100
            0110101
            1110101
            0000111
            0100000
            0111110
            0111000
        """.trimIndent()
        val expected = """
            3
            7
            8
            9
        """.trimIndent()

        No2667().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

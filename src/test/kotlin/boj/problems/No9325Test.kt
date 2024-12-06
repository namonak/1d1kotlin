package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9325Test : StringSpec({
    "얼마? : https://www.acmicpc.net/problem/9325" {
        val given = """
            2
            10000
            2
            1 2000
            3 400
            50000
            0
        """.trimIndent()
        val expected = """
            13200
            50000
        """.trimIndent()

        No9325().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

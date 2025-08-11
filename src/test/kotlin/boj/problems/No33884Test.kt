package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No33884Test : StringSpec({
    "클리크 조절 : https://www.acmicpc.net/problem/33884" {
        val given = """
            3
            0 0
            1 0
            1 1
            3 2
            3 3
            2 2
        """.trimIndent()
        val expected = "2 2"

        val result = No33884().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

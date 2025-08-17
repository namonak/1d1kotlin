package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1711Test : StringSpec({
    "직각삼각형 : https://www.acmicpc.net/problem/1711" {
        val given = """
            5
            -1 1
            -1 0
            0 0
            1 0
            1 1
        """.trimIndent()
        val expected = "7"

        val result = No1711().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

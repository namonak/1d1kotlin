package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14929Test : StringSpec({
    "귀찮아 (SIB) : https://www.acmicpc.net/problem/14929" {
        val given = """
            3
            1 -2 3
        """.trimIndent()
        val expected = "-5"

        val result = No14929().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26500Test : StringSpec({
    "Absolutely : https://www.acmicpc.net/problem/26500" {
        val given = """
            3
            3 5
            8.1 -9
            -6.4 -18.34
        """.trimIndent()
        val expected = """
            2.0
            17.1
            11.9
        """.trimIndent()

        val result = No26500().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

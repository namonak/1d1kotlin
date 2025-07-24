package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10480Test : StringSpec({
    "Oddities : https://www.acmicpc.net/problem/10480" {
        val given = """
            3
            10
            9
            -5
        """.trimIndent()
        val expected = """
            10 is even
            9 is odd
            -5 is odd
        """.trimIndent()

        val result = No10480().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

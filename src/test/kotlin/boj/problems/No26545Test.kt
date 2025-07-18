package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26545Test : StringSpec({
    "Mathematics : https://www.acmicpc.net/problem/26545" {
        val given = """
            3
            1
            2
            3
        """.trimIndent()
        val expected = "6"

        val actual = No26545().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})

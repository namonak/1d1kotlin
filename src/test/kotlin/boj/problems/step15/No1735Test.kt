package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1735Test : StringSpec({
    "분수 합 : https://www.acmicpc.net/problem/1735" {
        val input = """
            2 7
            3 5
        """.trimIndent()
        val expected = "31 35"

        val actual = No1735().solve(BufferedReader(StringReader(input)))

        actual shouldBe expected
    }
})

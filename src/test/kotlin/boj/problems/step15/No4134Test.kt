package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No4134Test : StringSpec({
    "다음 소수 : https://www.acmicpc.net/problem/4134" {
        val input = """
            3
            6
            20
            100
        """.trimIndent()
        val expected = """
            7
            23
            101
        """.trimIndent()

        val actual = No4134().solve(BufferedReader(StringReader(input)))

        actual shouldBe expected
    }
})

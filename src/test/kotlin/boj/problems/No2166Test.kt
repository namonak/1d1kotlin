package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2166Test : StringSpec({
    "다각형의 면적 : https://www.acmicpc.net/problem/2166" {
        val given = """
            4
            0 0
            0 10
            10 10
            10 0
        """.trimIndent()
        val expected = "100.0"

        val result = No2166().solve(given.reader().buffered())
        result shouldBe expected
    }
})

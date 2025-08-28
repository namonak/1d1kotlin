package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14400Test : StringSpec({
    "편의점 2 : https://www.acmicpc.net/problem/14400" {
        val given = """
            5
            2 2
            3 4
            5 6
            1 9
            -2 -8
        """.trimIndent()
        val expected = "30"

        val result = No14400().solve(given.reader().buffered())
        result shouldBe expected
    }
})
package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2740Test : StringSpec({
    "행렬 곱셈 : https://www.acmicpc.net/problem/2740" {
        val given = """
            3 2
            1 2
            3 4
            5 6
            2 3
            -1 -2 0
            0 0 3
        """.trimIndent()
        val expected = """
            -1 -2 6
            -3 -6 12
            -5 -10 18
        """.trimIndent()

        val result = No2740().solve(given.reader().buffered())
        result shouldBe expected
    }
})

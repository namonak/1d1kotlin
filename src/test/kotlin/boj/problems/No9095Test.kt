package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9095Test : StringSpec({
    "1, 2, 3 더하기 : https://www.acmicpc.net/problem/9095" {
        val given = """
            3
            4
            7
            10
        """.trimIndent()
        val expected = """
            7
            44
            274
        """.trimIndent()

        val actual = No9095().solve(given.reader().buffered())

        actual shouldBe expected
    }
})

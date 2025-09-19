package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9047Test : StringSpec({
    "6174 : https://www.acmicpc.net/problem/9047" {
        val given = """
            3
            6174
            1789
            2005
        """.trimIndent()
        val expected = """
            0
            3
            7
        """.trimIndent()

        val result = No9047().solve(given.reader().buffered())
        result shouldBe expected
    }
})

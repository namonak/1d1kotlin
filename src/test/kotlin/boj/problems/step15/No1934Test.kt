package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1934Test : StringSpec({
    "최소공배수 : https://www.acmicpc.net/problem/1934" {
        val given = """
            3
            1 45000
            6 10
            13 17
        """.trimIndent()
        val expected = """
            45000
            30
            221
        """.trimIndent()

        val actual = No1934().solve(given.reader().buffered())

        actual shouldBe expected
    }
})

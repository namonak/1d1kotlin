package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No33835Test : StringSpec({
    "도로 공사 : https://www.acmicpc.net/problem/33835" {
        val given = """
            3
            -1 0
            0 0
            1 0
        """.trimIndent()
        val expected = "2"

        val actual = No33835().solve(given.reader().buffered()).toDouble()

        actual shouldBe (expected.toDouble() plusOrMinus 1e-4)
    }
})

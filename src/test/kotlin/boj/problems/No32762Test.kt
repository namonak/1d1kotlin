package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No32762Test : StringSpec({
    "더치 페이 : https://www.acmicpc.net/problem/32762" {
        val given = """
            3 2
            1 3
            2 3
            3 3
            1 1000
            2 500
        """.trimIndent()
        val expected = "500.00000"

        val actual = No32762().solve(given.reader().buffered()).toDouble()

        actual shouldBe (expected.toDouble() plusOrMinus 1e-4)
    }
})

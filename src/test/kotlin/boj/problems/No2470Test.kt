package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2470Test : StringSpec({
    "두 용액 : https://www.acmicpc.net/problem/2470" {
        val given = """
            5
            -2 4 -99 -1 98
        """.trimIndent()
        val expected = "-99 98"

        val result = No2470().solve(given.reader().buffered())
        result shouldBe expected
    }
})

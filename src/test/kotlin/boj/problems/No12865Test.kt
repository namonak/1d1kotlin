package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12865Test : StringSpec({
    "평범한 배낭 : https://www.acmicpc.net/problem/12865" {
        val given = """
            4 7
            6 13
            4 8
            3 6
            5 12
        """.trimIndent()
        val expected = "14"

        val result = No12865().solve(given.reader().buffered())
        result shouldBe expected
    }
})

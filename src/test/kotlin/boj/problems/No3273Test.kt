package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3273Test : StringSpec({
    "두 수의 합 : https://www.acmicpc.net/problem/3273" {
        val given = """
            9
            5 12 7 10 9 1 2 3 11
            13
        """.trimIndent()
        val expected = "3"

        No3273().solve(given.reader().buffered()) shouldBe expected
    }
})

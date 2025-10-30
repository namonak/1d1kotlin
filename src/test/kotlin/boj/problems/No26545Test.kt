package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26545Test : StringSpec({
    "Mathematics : https://www.acmicpc.net/problem/26545" {
        val given = """
            3
            1
            2
            3
        """.trimIndent()
        val expected = "6"

        No26545().solve(given.reader().buffered()) shouldBe expected
    }
})

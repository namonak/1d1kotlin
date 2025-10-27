package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2587Test : StringSpec({
    "대표값2 : https://www.acmicpc.net/problem/2587" {
        val given = """
            10
            40
            30
            60
            30
        """.trimIndent()
        val expected = """
            34
            30
        """.trimIndent()

        No2587().solve(given.reader().buffered()) shouldBe expected
    }
})

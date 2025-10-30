package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5341Test : StringSpec({
    "Pyramids : https://www.acmicpc.net/problem/5341" {
        val given = """
            4
            6
            0
        """.trimIndent()
        val expected = """
            10
            21
        """.trimIndent()

        No5341().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11880Test : StringSpec({
    "개미 : https://www.acmicpc.net/problem/11880" {
        val given = """
            1
            1 2 3
        """.trimIndent()
        val expected = "18"

        No11880().solve(given.reader().buffered()) shouldBe expected
    }
})

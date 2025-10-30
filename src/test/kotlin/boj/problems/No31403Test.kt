package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31403Test : StringSpec({
    "A + B - C : https://www.acmicpc.net/problem/31403" {
        val given = """
            3
            4
            5
        """.trimIndent()
        val expected = """
            2
            29
        """.trimIndent()

        No31403().solve(given.reader().buffered()) shouldBe expected
    }
})

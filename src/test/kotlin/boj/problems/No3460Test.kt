package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3460Test : StringSpec({
    "이진수 : https://www.acmicpc.net/problem/3460" {
        val given = """
            1
            13
        """.trimIndent()
        val expected = "0 2 3"

        No3460().solve(given.reader().buffered()) shouldBe expected
    }
})

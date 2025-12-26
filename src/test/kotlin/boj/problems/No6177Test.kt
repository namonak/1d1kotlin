package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6177Test : StringSpec({
    "Statistics : https://www.acmicpc.net/problem/6177" {
        val given = """
            5
            12
            4
            6
            8
            2
        """.trimIndent()
        val expected = """
            6.400000
            6.000000
        """.trimIndent()

        No6177().solve(given.reader().buffered()) shouldBe expected
    }
})

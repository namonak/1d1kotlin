package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5789Test : StringSpec({
    "한다 안한다 : https://www.acmicpc.net/problem/5789" {
        val given = """
            3
            00100010
            01010101
            100001
        """.trimIndent()
        val expected = """
            Do-it
            Do-it-Not
            Do-it
        """.trimIndent()

        No5789().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1002Test : StringSpec({
    "터렛 : https://www.acmicpc.net/problem/1002" {
        val given = """
            3
            0 0 13 40 0 37
            0 0 3 0 7 4
            1 1 1 1 1 5
        """.trimIndent()
        val expected = """
            2
            1
            0
        """.trimIndent()

        No1002().solve(given.reader().buffered()) shouldBe expected
    }
})

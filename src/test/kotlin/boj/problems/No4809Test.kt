package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4809Test : StringSpec({
    "Stock Prices : https://www.acmicpc.net/problem/4809" {
        val given = """
            10 3 2
            1 2 3 4 5 6 7 8 9 10
            10 3 2
            10 9 8 7 6 5 4 3 2 1
            0 0 0
        """.trimIndent()
        val expected = """
            Case 1
            1 2 3
            10 9
            Case 2
            8 9 10
            2 1
        """.trimIndent()

        No4809().solve(given.reader().buffered()) shouldBe expected
    }
})

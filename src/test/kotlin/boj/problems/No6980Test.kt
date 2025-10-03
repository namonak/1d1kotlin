package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6980Test : StringSpec({
    "Train Swapping : https://www.acmicpc.net/problem/6980" {
        val given = """
            3
            3
            1 3 2
            4
            4 3 2 1
            2
            2 1
        """.trimIndent()
        val expected = """
            Optimal train swapping takes 1 swaps.
            Optimal train swapping takes 6 swaps.
            Optimal train swapping takes 1 swaps.
        """.trimIndent()

        No6980().solve(given.reader().buffered()) shouldBe expected
    }
})

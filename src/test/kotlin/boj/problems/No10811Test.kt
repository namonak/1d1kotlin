package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10811Test : StringSpec({
    "바구니 뒤집기 : https://www.acmicpc.net/problem/10811" {
        val given = """
            5 4
            1 2
            3 4
            1 4
            2 2
        """.trimIndent()
        val expected = "3 4 1 2 5"

        No10811().solve(given.reader().buffered()) shouldBe expected
    }
})

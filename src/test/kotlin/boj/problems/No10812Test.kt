package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10812Test : StringSpec({
    "바구니 순서 바꾸기 : https://www.acmicpc.net/problem/10812" {
        val given = """
            10 5
            1 6 4
            3 9 8
            2 10 5
            1 3 3
            2 6 2
        """.trimIndent()
        val expected = "1 4 6 2 3 7 10 5 8 9"

        No10812().solve(given.reader().buffered()) shouldBe expected
    }
})

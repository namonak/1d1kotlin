package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1932Test : StringSpec({
    "정수 삼각형 : https://www.acmicpc.net/problem/1932" {
        val given = """
            5
            7
            3 8
            8 1 0
            2 7 4 4
            4 5 2 6 5
        """.trimIndent()
        val expected = "30"

        No1932().solve(given.reader().buffered()) shouldBe expected
    }
})

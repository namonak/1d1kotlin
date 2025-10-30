package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24444Test : StringSpec({
    "알고리즘 수업 - 너비 우선 탐색 1 : https://www.acmicpc.net/problem/24444" {
        val given = """
            5 5 1
            1 4
            1 2
            2 3
            2 4
            3 4
        """.trimIndent()
        val expected = """
            1
            2
            4
            3
            0
        """.trimIndent()

        No24444().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24481Test : StringSpec({
    "알고리즘 수업 - 깊이 우선 탐색 3 : https://www.acmicpc.net/problem/24481" {
        val given = """
            5 5 1
            1 4
            1 2
            2 3
            2 4
            3 4
        """.trimIndent()
        val expected = """
            0
            1
            2
            3
            -1
        """.trimIndent()

        No24481().solve(given.reader().buffered()) shouldBe expected
    }
})

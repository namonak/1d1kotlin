package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24482Test : StringSpec({
    "알고리즘 수업 - 깊이 우선 탐색 4 : https://www.acmicpc.net/problem/24482" {
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
            3
            2
            1
            -1
        """.trimIndent()

        No24482().solve(given.reader().buffered()) shouldBe expected
    }
})

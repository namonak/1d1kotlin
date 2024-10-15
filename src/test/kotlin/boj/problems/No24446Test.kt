package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No24446Test : StringSpec({
    "알고리즘 수업 - 너비 우선 탐색 3 : https://www.acmicpc.net/problem/24446" {
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
            1
            -1
        """.trimIndent()

        No24446().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

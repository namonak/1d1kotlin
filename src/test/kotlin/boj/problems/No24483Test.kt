package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No24483Test : StringSpec({
    "알고리즘 수업 - 깊이 우선 탐색 5 : https://www.acmicpc.net/problem/24483" {
        val given = """
            5 5 1
            1 4
            1 2
            2 3
            2 4
            3 4
        """.trimIndent()
        val expected = "20"

        No24483().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10655Test : StringSpec({
    "마라톤 1 : https://www.acmicpc.net/problem/10655" {
        val given = """
            4
            0 0
            8 3
            11 -1
            10 0
        """.trimIndent()
        val expected = "14"

        No10655().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

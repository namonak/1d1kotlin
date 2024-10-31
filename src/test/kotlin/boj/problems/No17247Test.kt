package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No17247Test : StringSpec({
    "택시 거리 : https://www.acmicpc.net/problem/17247" {
        val given = """
            3 4
            1 0 0 0
            0 0 0 0
            0 0 0 1
        """.trimIndent()
        val expected = "5"

        No17247().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

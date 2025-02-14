package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15953Test : StringSpec({
    "상금 헌터 : https://www.acmicpc.net/problem/15953" {
        val given = """
            6
            8 4
            13 19
            8 10
            18 18
            8 25
            13 16
        """.trimIndent()
        val expected = """
            6
            8 4
            13 19
            8 10
            18 18
            8 25
            13 16
        """.trimIndent()

        No15953().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

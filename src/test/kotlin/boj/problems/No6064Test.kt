package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6064Test : StringSpec({
    "카잉 달력 : https://www.acmicpc.net/problem/6064" {
        val given = """
            3
            10 12 3 9
            10 12 7 2
            13 11 5 6
        """.trimIndent()
        val expected = """
            33
            -1
            83
        """.trimIndent()

        No6064().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

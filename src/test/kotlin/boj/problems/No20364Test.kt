package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20364Test : StringSpec({
    "부동산 다툼 : https://www.acmicpc.net/problem/20364" {
        val given = """
            6 4
            3
            5
            6
            2
        """.trimIndent()
        val expected = """
            0
            0
            3
            0
        """.trimIndent()

        val result = No20364().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

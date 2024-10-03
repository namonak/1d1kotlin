package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1855Test : StringSpec({
    "암호 : https://www.acmicpc.net/problem/1855" {
        val given = """
            3
            aeijfbcgklhd
        """.trimIndent()
        val expected = "abcdefghijkl"

        No1855().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

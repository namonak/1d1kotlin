package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9019Test : StringSpec({
    "DSLR : https://www.acmicpc.net/problem/9019" {
        val given = """
            3
            1234 3412
            1000 1
            1 16
        """.trimIndent()
        val expected = """
            LL
            L
            DDDD
        """.trimIndent()

        No9019().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

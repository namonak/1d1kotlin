package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9471Test : StringSpec({
    "피사노 주기 : https://www.acmicpc.net/problem/9471" {
        val given = """
            5
            1 4
            2 5
            3 11
            4 123456
            5 987654
        """.trimIndent()
        val expected = """
            1 6
            2 20
            3 10
            4 15456
            5 332808
        """.trimIndent()

        No9471().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

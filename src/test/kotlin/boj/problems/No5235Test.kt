package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5235Test : StringSpec({
    "Even Sum More Than Odd Sum : https://www.acmicpc.net/problem/5235" {
        val given = """
            4
            8 5 7 2 1 10 13 6 12
            4 5 2 3 4
            8 1 2 1 2 1 1 1 1
            6 1 1 2 3 5 8
        """.trimIndent()
        val expected = """
            EVEN
            ODD
            ODD
            TIE
        """.trimIndent()

        No5235().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

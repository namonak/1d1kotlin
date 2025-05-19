package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1946Test : StringSpec({
    "신입 사원 : https://www.acmicpc.net/problem/1946" {
        val given = """
            2
            5
            3 2
            1 4
            4 1
            2 3
            5 5
            7
            3 6
            7 3
            4 2
            1 4
            5 7
            2 5
            6 1
        """.trimIndent()
        val expected = """
            4
            3
        """.trimIndent()

        No1946().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

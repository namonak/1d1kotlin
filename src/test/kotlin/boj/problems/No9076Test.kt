package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9076Test : StringSpec({
    "점수 집계 : https://www.acmicpc.net/problem/9076" {
        val given = """
            4
            10 8 5 7 9
            10 9 10 9 5
            10 3 5 9 10
            1 2 3 6 9
        """.trimIndent()
        val expected = """
            24
            28
            KIN
            KIN
        """.trimIndent()

        No9076.solve(BufferedReader(given.reader())) shouldBe expected
    }
})

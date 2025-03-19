package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1894Test : StringSpec({
    "4번째 점 : https://www.acmicpc.net/problem/1894" {
        val given = """
            0.000 0.000 0.000 1.000 0.000 1.000 1.000 1.000
            1.000 0.000 3.500 3.500 3.500 3.500 0.000 1.000
            1.866 0.000 3.127 3.543 3.127 3.543 1.412 3.145
        """.trimIndent()
        val expected = """
            1.000 0.000
            -2.500 -2.500
            0.151 -0.398
        """.trimIndent()

        No1894().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

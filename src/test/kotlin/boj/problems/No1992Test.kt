package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1992Test : StringSpec({
    "쿼드트리 : https://www.acmicpc.net/problem/1992" {
        val given = """
            8
            11110000
            11110000
            00011100
            00011100
            11110000
            11110000
            11110011
            11110011
        """.trimIndent()
        val expected = "((110(0101))(0010)1(0001))"

        No1992().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

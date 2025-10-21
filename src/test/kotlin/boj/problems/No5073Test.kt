package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5073Test : StringSpec({
    "삼각형과 세 변 : https://www.acmicpc.net/problem/5073" {
        val given = """
            7 7 7
            6 5 4
            3 2 5
            6 2 6
            0 0 0
        """.trimIndent()
        val expected = """
            Equilateral
            Scalene
            Invalid
            Isosceles
        """.trimIndent()

        No5073().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

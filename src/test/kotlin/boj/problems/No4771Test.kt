package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4771Test : StringSpec({
    "아름다운 삼각형 : https://www.acmicpc.net/problem/4771" {
        val given = """
            10.000 10.000 10.000 20.000 20.000 10.000
            0.000 0.000 4.000 0.000 2.000 3.464
            -1
        """.trimIndent()
        val expected = """
            Isosceles Right
            Equilateral Acute
        """.trimIndent()

        val result = No4771().solve(given.reader().buffered())
        result shouldBe expected
    }
})

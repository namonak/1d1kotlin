package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10039Test : StringSpec({
    "평균 점수 : https://www.acmicpc.net/problem/10039" {
        val given = """
            10
            65
            100
            30
            95
        """.trimIndent()
        val expected = "68"

        val actual = No10039().solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2527Test : StringSpec({
    "직사각형 : https://www.acmicpc.net/problem/2527" {
        val given = """
            3 10 50 60 100 100 200 300
            45 50 600 600 400 450 500 543
            11 120 120 230 50 40 60 440
            35 56 67 90 67 80 500 600
        """.trimIndent()
        val expected = """
            d
            a
            a
            b
        """.trimIndent()

        No2527().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

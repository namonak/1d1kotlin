package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10101Test : StringSpec({
    "삼각형 외우기 : https://www.acmicpc.net/problem/10101" {
        val given = """
            60
            70
            50
        """.trimIndent()
        val expected = "Scalene"

        No10101.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

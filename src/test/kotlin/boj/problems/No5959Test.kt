package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5959Test : StringSpec({
    "Crop Circles : https://www.acmicpc.net/problem/5959" {
        val given = """
            6
            7 7 7
            16 14 7
            11 13 2
            10 17 3
            29 8 5
            15 7 4
        """.trimIndent()
        val expected = """
            3
            4
            3
            2
            0
            2
        """.trimIndent()

        val result = No5959().solve(given.reader().buffered())
        result shouldBe expected
    }
})

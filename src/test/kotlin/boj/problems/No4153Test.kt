package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4153Test : StringSpec({
    "직각삼각형 : https://www.acmicpc.net/problem/4153" {
        val given = """
            6 8 10
            25 52 60
            5 12 13
            0 0 0
        """.trimIndent()
        val expected = """
            right
            wrong
            right
        """.trimIndent()

        No4153.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

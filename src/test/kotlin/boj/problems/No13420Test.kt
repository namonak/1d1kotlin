package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13420Test : StringSpec({
    "사칙연산 : https://www.acmicpc.net/problem/13420" {
        val given = """
            4
            3 * 2 = 6
            11 + 11 = 11
            7 - 9 = -2
            3 * 0 = 0
        """.trimIndent()
        val expected = """
            correct
            wrong answer
            correct
            correct
        """.trimIndent()

        No13420().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

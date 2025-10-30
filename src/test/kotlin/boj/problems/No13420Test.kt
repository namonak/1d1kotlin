package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13420Test : StringSpec({
    "사칙연산 : https://www.acmicpc.net/problem/13420" {
        val given = """
            8
            3 * 0 = 0
            3 * 2 = 7
            11 + 11 = 22
            11 + 11 = 11
            7 - 9 = -2
            7 - 9 = 1
            9 / 3 = 3
            9 / 3 = 4
        """.trimIndent()
        val expected = """
            correct
            wrong answer
            correct
            wrong answer
            correct
            wrong answer
            correct
            wrong answer
        """.trimIndent()

        No13420().solve(given.reader().buffered()) shouldBe expected
    }
})

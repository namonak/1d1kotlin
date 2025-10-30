package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2711Test : StringSpec({
    "오타맨 고창영 : https://www.acmicpc.net/problem/2711" {
        val given = """
            4
            4 MISSPELL
            1 PROGRAMMING
            7 CONTEST
            3 BALLOON
        """.trimIndent()
        val expected = """
            MISPELL
            ROGRAMMING
            CONTES
            BALOON
        """.trimIndent()

        No2711().solve(given.reader().buffered()) shouldBe expected
    }
})

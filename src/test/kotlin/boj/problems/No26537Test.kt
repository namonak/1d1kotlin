package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26537Test : StringSpec({
    "Animal Conference : https://www.acmicpc.net/problem/26537" {
        val given = """
            2
            11
            90 60
            80 30
            12 94
            13 43
            24 40
            26 86
            30 60
            32 63
            70 50
            60 96
            34 20
            5
            2 0
            1 0
            0 0
            1 1
            0 1
        """.trimIndent()
        val expected = """
            30 60 32 63
            0 0 0 1
        """.trimIndent()

        val result = No26537().solve(given.reader().buffered())
        result shouldBe expected
    }
})

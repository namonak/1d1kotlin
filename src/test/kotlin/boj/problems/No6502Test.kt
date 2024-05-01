package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6502Test : StringSpec({
    "동혁 피자 : https://www.acmicpc.net/problem/6502" {
        val given = """
            38 40 60
            35 20 70
            50 60 80
            0
        """.trimIndent()
        val expected = """
            Pizza 1 fits on the table.
            Pizza 2 does not fit on the table.
            Pizza 3 fits on the table.
        """.trimIndent()

        No6502().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

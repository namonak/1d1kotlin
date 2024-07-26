package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4388Test : StringSpec({
    "받아올림 : https://www.acmicpc.net/problem/4388" {
        val given = """
            123 456
            555 555
            123 594
            0 0
        """.trimIndent()
        val expected = """
            0
            3
            1
        """.trimIndent()

        No4388().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

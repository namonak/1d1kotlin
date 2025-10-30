package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4504Test : StringSpec({
    "배수 찾기 : https://www.acmicpc.net/problem/4504" {
        val given = """
            3
            1
            7
            99
            321
            777
            0
        """.trimIndent()
        val expected = """
            1 is NOT a multiple of 3.
            7 is NOT a multiple of 3.
            99 is a multiple of 3.
            321 is a multiple of 3.
            777 is a multiple of 3.
        """.trimIndent()

        No4504().solve(given.reader().buffered()) shouldBe expected
    }
})

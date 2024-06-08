package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1408Test : StringSpec({
    "24 : https://www.acmicpc.net/problem/1408" {
        val given = """
            13:52:30
            14:00:00
        """.trimIndent()
        val expected = """
            00:07:30
        """.trimIndent()

        No1408().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

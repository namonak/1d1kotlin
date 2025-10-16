package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4796Test : StringSpec({
    "캠핑 : https://www.acmicpc.net/problem/4796" {
        val given = """
            5 8 20
            5 8 17
            0 0 0
        """.trimIndent()
        val expected = """
            Case 1: 14
            Case 2: 11
        """.trimIndent()

        No4796().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

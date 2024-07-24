package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26711Test : StringSpec({
    "A+B : https://www.acmicpc.net/problem/26711" {
        val given = """
            1997
            25
        """.trimIndent()
        val expected = """
            2022
        """.trimIndent()

        No26711().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

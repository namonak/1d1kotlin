package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26546Test : StringSpec({
    "Reverse : https://www.acmicpc.net/problem/26546" {
        val given = """
            3
            COMPUTER 1 3
            SCIENCE 3 7
            RULES 3 4
        """.trimIndent()
        val expected = """
            CPUTER
            SCI
            RULS
        """.trimIndent()

        No26546().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

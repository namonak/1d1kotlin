package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30007Test : StringSpec({
    "라면 공식 : https://www.acmicpc.net/problem/30007" {
        val given = """
            2
            500 550 4
            450 500 7
        """.trimIndent()
        val expected = """
            2050
            3200
        """.trimIndent()

        No30007().solve(given.reader().buffered()) shouldBe expected
    }
})

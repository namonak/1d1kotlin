package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26561Test : StringSpec({
    "Population : https://www.acmicpc.net/problem/26561" {
        val given = """
            3
            12 14
            530 200
            4786 3543
        """.trimIndent()
        val expected = """
            13
            552
            5165
        """.trimIndent()

        No26561().solve(given.reader().buffered()) shouldBe expected
    }
})

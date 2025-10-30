package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4573Test : StringSpec({
    "Pizza Pricing : https://www.acmicpc.net/problem/4573" {
        val given = """
            3
            5 2
            10 6
            12 8
            3
            5 2
            10 5
            12 8
            4
            1 1
            24 33
            13 11
            6 11
            0
        """.trimIndent()
        val expected = """
            Menu 1: 12
            Menu 2: 10
            Menu 3: 24
        """.trimIndent()

        No4573().solve(given.reader().buffered()) shouldBe expected
    }
})

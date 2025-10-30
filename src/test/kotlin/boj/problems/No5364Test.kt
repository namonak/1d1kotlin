package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5364Test : StringSpec({
    "Escape Route : https://www.acmicpc.net/problem/5364" {
        val given = """
            7
            5 4
            -80 9
            100 89
            67 -40
            10 20
            15 -5
            34 0
        """.trimIndent()
        val expected = """
            5 4
            15 -5
            13.45
        """.trimIndent()

        No5364().solve(given.reader().buffered()) shouldBe expected
    }
})

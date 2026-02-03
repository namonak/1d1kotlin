package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4751Test : StringSpec({
    "Extrusion : https://www.acmicpc.net/problem/4751" {
        val given = """
            4
            0.0 0.0
            0.0 0.1
            0.1 0.1
            0.1 0.0
            1.0
            7
            0.5 1.25
            0.9 1.6
            0.9 1.1
            0.85 1.0
            0.9 0.85
            0.9 0.5
            0.5 0.75
            100.0
            0
        """.trimIndent()
        val expected = """
            BAR LENGTH: 100.00
            BAR LENGTH: 318.73
        """.trimIndent()

        No4751().solve(given.reader().buffered()) shouldBe expected
    }
})

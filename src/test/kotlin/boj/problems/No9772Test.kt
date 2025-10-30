package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9772Test : StringSpec({
    "Quadrants : https://www.acmicpc.net/problem/9772" {
        val given = """
            1 2
            -1 -0.12
            4 0
            -10.4 200
            0 0
        """.trimIndent()
        val expected = """
            Q1
            Q3
            AXIS
            Q2
            AXIS
        """.trimIndent()

        No9772().solve(given.reader().buffered()) shouldBe expected
    }
})

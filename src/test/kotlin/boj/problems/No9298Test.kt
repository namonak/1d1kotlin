package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9298Test : StringSpec({
    "Ant Entrapment : https://www.acmicpc.net/problem/9298" {
        val given = """
            2
            3
            -1.000 0.000
            5.000 11.500
            3.200 -4.250
            2
            2.125 0.500
            6.875 9.100
        """.trimIndent()
        val expected = """
            Case 1: Area 94.5, Perimeter 43.5
            Case 2: Area 40.85, Perimeter 26.7
        """.trimIndent()

        No9298().solve(given.reader().buffered()) shouldBe expected
    }
})

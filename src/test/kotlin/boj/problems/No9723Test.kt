package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9723Test : StringSpec({
    "Right Triangle : https://www.acmicpc.net/problem/9723" {
        val given = """
            10
            20 16 12
            5 3 4
            15 12 9
            12 5 13
            12 13 5
            28 82 46
            43 96 92
            3 4 5
            13 5 12
            6 10 8
        """.trimIndent()
        val expected = """
            Case #1: YES
            Case #2: YES
            Case #3: YES
            Case #4: YES
            Case #5: YES
            Case #6: NO
            Case #7: NO
            Case #8: YES
            Case #9: YES
            Case #10: YES
        """.trimIndent()

        No9723().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9699Test : StringSpec({
    "RICE SACK : https://www.acmicpc.net/problem/9699" {
        val given = """
            4
            1 6 10 5 20
            5 10 25 3 1
            30 15 5 1 8
            7 4 20 50 5
        """.trimIndent()
        val expected = """
            Case #1: 20
            Case #2: 25
            Case #3: 30
            Case #4: 50
        """.trimIndent()

        No9699().solve(given.reader().buffered()) shouldBe expected
    }
})

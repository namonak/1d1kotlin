package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12354Test : StringSpec({
    "Ocean View (Small) : https://www.acmicpc.net/problem/12354" {
        val given = """
            4
            4
            1 4 3 3
            5
            3 4 6 7 10
            4
            4 3 2 1
            5
            4 5 6 1 7

        """.trimIndent()
        val expected = """
            Case #1: 2
            Case #2: 0
            Case #3: 3
            Case #4: 1
        """.trimIndent()

        No12354().solve(given.reader().buffered()) shouldBe expected
    }
})

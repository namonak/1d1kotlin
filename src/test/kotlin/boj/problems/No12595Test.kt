package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12595Test : StringSpec({
    "Odd Man Out (Small) : https://www.acmicpc.net/problem/12595" {
        val given = """
            3
            3
            1 2147483647 2147483647
            5
            3 4 7 4 3
            5
            2 10 2 10 5
        """.trimIndent()
        val expected = """
            Case #1: 1
            Case #2: 7
            Case #3: 5
        """.trimIndent()

        No12595().solve(given.reader().buffered()) shouldBe expected
    }
})

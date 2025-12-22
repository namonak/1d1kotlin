package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26511Test : StringSpec({
    "Complexity : https://www.acmicpc.net/problem/26511" {
        val given = """
            5
            string
            letter
            aaabbb
            aaabbbccc
            uncopyrightable
        """.trimIndent()
        val expected = """
            4
            2
            0
            3
            13
        """.trimIndent()

        No26511().solve(given.reader().buffered()) shouldBe expected
    }
})

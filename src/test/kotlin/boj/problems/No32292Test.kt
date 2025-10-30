package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32292Test : StringSpec({
    "ABB to BA (Easy) : https://www.acmicpc.net/problem/32292" {
        val given = """
            3
            3
            ABB
            9
            ABABABBBB
            12
            AAAAAABBBBBB
        """.trimIndent()
        val expected = """
            BA
            BAABA
            AAAABABA
        """.trimIndent()

        No32292().solve(given.reader().buffered()) shouldBe expected
    }
})

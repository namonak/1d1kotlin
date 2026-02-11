package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8892Test : StringSpec({
    "팰린드롬 : https://www.acmicpc.net/problem/8892" {
        val given = """
            2
            5
            aaba
            ba
            ababa
            bbaa
            baaba
            3
            abc
            bcd
            cde
        """.trimIndent()
        val expected = """
            abababa
            0
        """.trimIndent()

        No8892().solve(given.reader().buffered()) shouldBe expected
    }
})

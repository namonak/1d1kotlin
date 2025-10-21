package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6996Test : StringSpec({
    "No6996 : https://www.acmicpc.net/problem/6996" {
        val given = """
            3
            blather reblath
            maryland landam
            bizarre brazier
        """.trimIndent()
        val expected = """
            blather & reblath are anagrams.
            maryland & landam are NOT anagrams.
            bizarre & brazier are anagrams.
        """.trimIndent()

        No6996().solve(given.reader().buffered()) shouldBe expected
    }
})

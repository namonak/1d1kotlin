package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8595Test : StringSpec({
    "히든 넘버 : https://www.acmicpc.net/problem/8595" {
        val given = """
            14
            ab13c9d07jeden
        """.trimIndent()
        val expected = "29"

        No8595().solve(given.reader().buffered()) shouldBe expected
    }
})

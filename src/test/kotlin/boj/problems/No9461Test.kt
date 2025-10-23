package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9461Test : StringSpec({
    "파도반 수열 : https://www.acmicpc.net/problem/9461" {
        val given = """
            2
            6
            12
        """.trimIndent()
        val expected = """
            3
            16
        """.trimIndent()

        No9461().solve(given.reader().buffered()) shouldBe expected
    }
})

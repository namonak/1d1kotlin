package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6321Test : StringSpec({
    "IBM 빼기 1 : https://www.acmicpc.net/problem/6321" {
        val given = """
            2
            HAL
            SWERC
        """.trimIndent()
        val expected = """
            String #1
            IBM

            String #2
            TXFSD
        """.trimIndent()

        No6321().solve(given.reader().buffered()) shouldBe expected
    }
})

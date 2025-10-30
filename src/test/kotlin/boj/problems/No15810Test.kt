package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15810Test : StringSpec({
    "풍선 공장 : https://www.acmicpc.net/problem/15810" {
        val given = """
            3 8
            5 7 3
        """.trimIndent()
        val expected = "14"

        No15810().solve(given.reader().buffered()) shouldBe expected
    }
})

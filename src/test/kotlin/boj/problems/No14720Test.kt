package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14720Test : StringSpec({
    "우유 축제 : https://www.acmicpc.net/problem/14720" {
        val given = """
            7
            0 1 2 0 1 2 0
        """.trimIndent()
        val expected = "7"

        No14720().solve(given.reader().buffered()) shouldBe expected
    }
})

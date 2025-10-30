package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8716Test : StringSpec({
    "Pole : https://www.acmicpc.net/problem/8716" {
        val given = """
            0 3 4 0
            2 4 6 1
        """.trimIndent()
        val expected = "4"

        No8716().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30802Test : StringSpec({
    "웰컴 키트 : https://www.acmicpc.net/problem/30802" {
        val given = """
            23
            3 1 4 1 5 9
            5 7
        """.trimIndent()
        val expected = """
            7
            3 2
        """.trimIndent()

        No30802().solve(given.reader().buffered()) shouldBe expected
    }
})

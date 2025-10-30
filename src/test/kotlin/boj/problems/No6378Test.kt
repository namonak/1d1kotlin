package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6378Test : StringSpec({
    "디지털 루트 : https://www.acmicpc.net/problem/6378" {
        val given = """
            24
            39
            0
        """.trimIndent()
        val expected = """
            6
            3
        """.trimIndent()

        No6378().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5026Test : StringSpec({
    "박사 과정 : https://www.acmicpc.net/problem/5026" {
        val given = """
            4
            2+2
            1+2
            P=NP
            0+0
        """.trimIndent()
        val expected = """
            4
            3
            skipped
            0
        """.trimIndent()

        No5026().solve(given.reader().buffered()) shouldBe expected
    }
})

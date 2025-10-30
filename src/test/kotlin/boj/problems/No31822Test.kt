package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31822Test : StringSpec({
    "재수강 : https://www.acmicpc.net/problem/31822" {
        val given = """
            000200D-18
            5
            000200D-18
            000200C-01
            000210D-18
            660820A-01
            0002000-00
        """.trimIndent()
        val expected = "3"

        No31822().solve(given.reader().buffered()) shouldBe expected
    }
})

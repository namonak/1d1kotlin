package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3495Test : StringSpec({
    "아스키 도형 : https://www.acmicpc.net/problem/3495" {
        val given = """
            4 4
            /\/\
            \../
            .\.\
            ..\/
        """.trimIndent()
        val expected = "8"

        No3495().solve(given.reader().buffered()) shouldBe expected
    }
})

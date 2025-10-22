package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9086Test : StringSpec({
    "문자열 : https://www.acmicpc.net/problem/9086" {
        val given = """
            3
            ACDKJFOWIEGHE
            O
            AB
        """.trimIndent()
        val expected = """
            AE
            OO
            AB
        """.trimIndent()

        No9086().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31090Test : StringSpec({
    "2023은 무엇이 특별할까? : https://www.acmicpc.net/problem/31090" {
        val given = """
            3
            2023
            2024
            2029
        """.trimIndent()
        val expected = """
            Good
            Bye
            Good
        """.trimIndent()

        No31090().solve(given.reader().buffered()) shouldBe expected
    }
})

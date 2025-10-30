package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8437Test : StringSpec({
    "Julka : https://www.acmicpc.net/problem/8437" {
        val given = """
            10
            2
        """.trimIndent()
        val expected = """
            6
            4
        """.trimIndent()

        No8437().solve(given.reader().buffered()) shouldBe expected
    }
})

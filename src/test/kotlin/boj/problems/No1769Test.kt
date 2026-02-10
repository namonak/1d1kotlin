package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1769Test : StringSpec({
    "3의 배수 : https://www.acmicpc.net/problem/1769" {
        val given = """
            1234567
        """.trimIndent()
        val expected = """
            3
            NO
        """.trimIndent()

        No1769().solve(given.reader().buffered()) shouldBe expected
    }
})

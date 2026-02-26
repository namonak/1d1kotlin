package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1890Test : StringSpec({
    "점프 : https://www.acmicpc.net/problem/1890" {
        val given = """
            4
            2 3 3 1
            1 2 1 3
            1 2 3 1
            3 1 1 0
        """.trimIndent()
        val expected = "3"

        No1890().solve(given.reader().buffered()) shouldBe expected
    }
})

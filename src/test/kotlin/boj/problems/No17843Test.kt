package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17843Test : StringSpec({
    "시계 : https://www.acmicpc.net/problem/17843" {
        val given = """
            1
            7 47 17
        """.trimIndent()
        val expected = "50.058333"

        No17843().solve(given.reader().buffered()) shouldBe expected
    }
})

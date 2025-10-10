package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10250Test : StringSpec({
    "ACM 호텔 : https://www.acmicpc.net/problem/10250" {
        val given = """
            2
            6 12 10
            30 50 72
        """.trimIndent()
        val expected = """
            402
            1203
        """.trimIndent()

        No10250().solve(given.reader().buffered()) shouldBe expected
    }
})

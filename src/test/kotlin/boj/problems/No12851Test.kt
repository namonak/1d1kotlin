package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12851Test : StringSpec({
    "숨바꼭질 2 : https://www.acmicpc.net/problem/12851" {
        val given = "5 17"
        val expected = """
            4
            2
        """.trimIndent()

        No12851().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2338Test : StringSpec({
    "긴자리 계산 : https://www.acmicpc.net/problem/2338" {
        val given = """
            1
            -1
        """.trimIndent()
        val expected = """
            0
            2
            -1
        """.trimIndent()

        No2338().solve(given.reader().buffered()) shouldBe expected
    }
})

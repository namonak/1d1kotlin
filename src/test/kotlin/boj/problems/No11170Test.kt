package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11170Test : StringSpec({
    "0의 개수 : https://www.acmicpc.net/problem/11170" {
        val given = """
            3
            0 10
            33 1005
            1 4
        """.trimIndent()
        val expected = """
            2
            199
            0
        """.trimIndent()

        No11170().solve(given.reader().buffered()) shouldBe expected
    }
})

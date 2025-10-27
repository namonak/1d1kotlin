package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2720Test : StringSpec({
    "세탁소 사장 동혁 : https://www.acmicpc.net/problem/2720" {
        val given = """
            3
            124
            25
            194
        """.trimIndent()
        val expected = """
            4 2 0 4
            1 0 0 0
            7 1 1 4
        """.trimIndent()

        No2720().solve(given.reader().buffered()) shouldBe expected
    }
})

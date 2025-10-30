package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2776Test : StringSpec({
    "암기왕 : https://www.acmicpc.net/problem/2776" {
        val given = """
            1
            5
            4 1 5 2 3
            5
            1 3 7 9 5
        """.trimIndent()
        val expected = """
            1
            1
            0
            0
            1
        """.trimIndent()

        No2776().solve(given.reader().buffered()) shouldBe expected
    }
})

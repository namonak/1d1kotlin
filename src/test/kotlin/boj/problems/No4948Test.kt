package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4948Test : StringSpec({
    "베르트랑 공준 : https://www.acmicpc.net/problem/4948" {
        val given = """
            1
            10
            13
            100
            1000
            10000
            100000
            0
        """.trimIndent()
        val expected = """
            1
            4
            3
            21
            135
            1033
            8392
        """.trimIndent()

        No4948().solve(given.reader().buffered()) shouldBe expected
    }
})

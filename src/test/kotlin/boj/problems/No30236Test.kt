package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30236Test : StringSpec({
    "증가 수열 : https://www.acmicpc.net/problem/30236" {
        val given = """
            3
            5
            1 3 2 6 7
            4
            2 3 4 5
            1
            1
        """.trimIndent()
        val expected = """
            8
            4
            2
        """.trimIndent()

        No30236().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3449Test : StringSpec({
    "해밍 거리 : https://www.acmicpc.net/problem/3449" {
        val given = """
            4
            0
            1
            000
            000
            1111111100000000
            0000000011111111
            101
            000
        """.trimIndent()
        val expected = """
            Hamming distance is 1.
            Hamming distance is 0.
            Hamming distance is 16.
            Hamming distance is 2.
        """.trimIndent()

        No3449().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2729Test : StringSpec({
    "이진수 덧셈 : https://www.acmicpc.net/problem/2729" {
        val given = """
            3
            1001101 10010
            1001001 11001
            1000111 1010110
        """.trimIndent()
        val expected = """
            1011111
            1100010
            10011101
        """.trimIndent()

        No2729().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

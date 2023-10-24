package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2075Test : StringSpec({
    "N번째 큰 수 : https://www.acmicpc.net/problem/2075" {
        val given = """
            5
            12 7 9 15 5
            13 8 11 19 6
            21 10 26 31 16
            48 14 28 35 25
            52 20 32 41 49
        """.trimIndent()
        val expected = """
            35
        """.trimIndent()

        No2075.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11501Test : StringSpec({
    "주식 : https://www.acmicpc.net/problem/11501" {
        val given = """
            3
            3
            10 7 6
            3
            3 5 9
            5
            1 1 3 1 2
        """.trimIndent()
        val expected = """
            0
            10
            5
        """.trimIndent()

        No11501().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

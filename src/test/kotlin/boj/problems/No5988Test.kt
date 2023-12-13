package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5988Test : StringSpec({
    "홀수일까 짝수일까 : https://www.acmicpc.net/problem/5988" {
        val given = """
            2
            1024
            5931
        """.trimIndent()
        val expected = """
            even
            odd
        """.trimIndent()

        No5988.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

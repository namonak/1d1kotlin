package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2506Test : StringSpec({
    "점수계산 : https://www.acmicpc.net/problem/2506" {
        val given = """
            10
            1 0 1 1 1 0 0 1 1 0
        """.trimIndent()
        val expected = "10"

        No2506.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

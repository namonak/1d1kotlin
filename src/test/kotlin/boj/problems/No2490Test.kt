package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2490Test : StringSpec({
    "윷놀이 : https://www.acmicpc.net/problem/2490" {
        val given = """
            0 1 0 1
            1 1 1 0
            0 0 1 1
        """.trimIndent()
        val expected = """
            B
            A
            B
        """.trimIndent()

        No2490.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9372Test : StringSpec({
    "상근이의 여행 : https://www.acmicpc.net/problem/9372" {
        val given = """
            2
            3 3
            1 2
            2 3
            1 3
            5 4
            2 1
            2 3
            4 3
            4 5
        """.trimIndent()
        val expected = """
            2
            4
        """.trimIndent()

        No9372().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9085Test : StringSpec({
    "더하기 : https://www.acmicpc.net/problem/9085" {
        val given = """
            2
            5
            1 1 1 1 1
            7
            1 2 3 4 5 6 7
        """.trimIndent()
        val expected = """
            5
            28
        """.trimIndent()

        No9085.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30501Test : StringSpec({
    "관공... 어찌하여 목만 오셨소... : https://www.acmicpc.net/problem/30501" {
        val given = """
            3
            ZHOUYU
            SUNQUAN
            ZOZO
        """.trimIndent()
        val expected = "SUNQUAN"

        No30501().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

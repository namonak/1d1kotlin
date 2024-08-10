package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7891Test : StringSpec({
    "Can you add this? : https://www.acmicpc.net/problem/7891" {
        val given = """
            4
            -100 100
            2 3
            0 110101
            -1000000000 1
        """.trimIndent()
        val expected = """
            0
            5
            110101
            -999999999
        """.trimIndent()

        No7891().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

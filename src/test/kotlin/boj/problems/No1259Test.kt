package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1259Test : StringSpec({
    "팰린드롬수 : https://www.acmicpc.net/problem/1259" {
        val given = """
            121
            1231
            12421
            0
        """.trimIndent()
        val expected = """
            yes
            no
            yes
        """.trimIndent()

        No1259().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

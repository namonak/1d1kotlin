package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10569Test : StringSpec({
    "다면체 : https://www.acmicpc.net/problem/10569" {
        val given = """
            2
            8 12
            4 6
        """.trimIndent()
        val expected = """
            6
            4
        """.trimIndent()

        No10569().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

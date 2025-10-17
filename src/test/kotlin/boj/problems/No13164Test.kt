package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13164Test : StringSpec({
    "행복 유치원 : https://www.acmicpc.net/problem/13164" {
        val given = """
            5 3
            1 3 5 6 10
        """.trimIndent()
        val expected = "3"

        No13164().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

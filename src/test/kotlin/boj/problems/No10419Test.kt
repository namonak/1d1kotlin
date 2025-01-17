package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10419Test : StringSpec({
    "지각 : https://www.acmicpc.net/problem/10419" {
        val given = """
            5
            1
            2
            5
            6
            7
        """.trimIndent()
        val expected = """
            0
            1
            1
            2
            2
        """.trimIndent()

        No10419().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

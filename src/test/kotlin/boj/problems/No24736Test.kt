package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No24736Test : StringSpec({
    "Football Scoring : https://www.acmicpc.net/problem/24736" {
        val given = """
            1 3 0 0 1
            3 1 1 1 1
        """.trimIndent()
        val expected = "17 26"

        No24736().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

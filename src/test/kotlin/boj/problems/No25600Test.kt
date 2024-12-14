package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25600Test : StringSpec({
    "Triathlon : https://www.acmicpc.net/problem/25600" {
        val given = """
            5
            1 0 1
            5 2 3
            5 5 4
            0 1 4
            3 7 2
        """.trimIndent()
        val expected = "50"

        No25600().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

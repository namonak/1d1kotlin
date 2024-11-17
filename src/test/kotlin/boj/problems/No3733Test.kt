package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3733Test : StringSpec({
    "Shares : https://www.acmicpc.net/problem/3733" {
        val given = """
            1 100
            2 7
            10 9
            10 10
        """.trimIndent()
        val expected = """
            50
            2
            0
            0
        """.trimIndent()

        No3733().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

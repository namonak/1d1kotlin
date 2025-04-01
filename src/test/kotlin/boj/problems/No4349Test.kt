package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4349Test : StringSpec({
    "Blocks : https://www.acmicpc.net/problem/4349" {
        val given = """
            5
            9
            10
            26
            27
            100
        """.trimIndent()
        val expected = """
            30
            34
            82
            54
            130
        """.trimIndent()

        No4349().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

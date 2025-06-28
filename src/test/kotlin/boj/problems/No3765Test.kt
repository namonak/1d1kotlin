package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3765Test : StringSpec({
    "Celebrity jeopardy : https://www.acmicpc.net/problem/3765" {
        val given = """
            Y = 3
            X=9
        """.trimIndent()
        val expected = """
            Y = 3
            X=9
        """.trimIndent()

        val result = No3765().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

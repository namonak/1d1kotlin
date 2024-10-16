package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10974Test : StringSpec({
    "모든 순열 : https://www.acmicpc.net/problem/10974" {
        val given = "3"
        val expected = """
            1 2 3
            1 3 2
            2 1 3
            2 3 1
            3 1 2
            3 2 1
        """.trimIndent()

        No10974().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15235Test : StringSpec({
    "Olympiad Pizza : https://www.acmicpc.net/problem/15235" {
        val given = """
            4
            1 3 1 4
        """.trimIndent()
        val expected = "1 7 3 9"

        No15235().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

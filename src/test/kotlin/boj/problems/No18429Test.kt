package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18429Test : StringSpec({
    "근손실 : https://www.acmicpc.net/problem/18429" {
        val given = """
            3 4
            3 7 5
        """.trimIndent()
        val expected = "4"

        val result = No18429().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})

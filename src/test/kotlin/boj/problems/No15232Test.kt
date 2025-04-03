package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15232Test : StringSpec({
    "Rectangles : https://www.acmicpc.net/problem/15232" {
        val given = """
            3
            5
        """.trimIndent()
        val expected = """
            *****
            *****
            *****
        """.trimIndent()

        No15232().solve(BufferedReader(given.reader())) shouldBe expected
    }
})

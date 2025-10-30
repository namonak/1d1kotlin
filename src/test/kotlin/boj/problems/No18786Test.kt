package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18786Test : StringSpec({
    "Triangles (Bronze) : https://www.acmicpc.net/problem/18786" {
        val given = """
            4
            0 0
            0 1
            1 0
            1 2
        """.trimIndent()
        val expected = "2"

        val result = No18786().solve(given.reader().buffered())
        result shouldBe expected
    }
})

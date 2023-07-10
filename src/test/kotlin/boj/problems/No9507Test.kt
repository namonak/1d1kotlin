package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9507Test : StringSpec({
    "Generations of Tribbles : https://www.acmicpc.net/problem/9507" {
        val given = """
            8
            0
            1
            2
            3
            4
            5
            30
            67
        """.trimIndent()
        val expected = """
            1
            1
            2
            4
            8
            15
            201061985
            7057305768232953720
        """.trimIndent()

        val actual = No9507.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})

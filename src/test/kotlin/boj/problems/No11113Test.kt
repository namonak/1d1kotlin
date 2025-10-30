package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11113Test : StringSpec({
    "The Traveling Orienteerer : https://www.acmicpc.net/problem/11113" {
        val given = """
            5
            0.0 0.0
            1000.0 1000.0
            123.45 0.0
            3475.43 7765.4
            4325.9865 13.0
            2
            2
            0 1
            4
            3 1 4 0
        """.trimIndent()
        val expected = """
            1414
            14999
        """.trimIndent()

        No11113().solve(given.reader().buffered()) shouldBe expected
    }
})

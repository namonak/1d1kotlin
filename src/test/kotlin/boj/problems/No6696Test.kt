package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6696Test : StringSpec({
    "Too Much Water : https://www.acmicpc.net/problem/6696" {
        val given = """
            1.0 1.0
            25.0 0.0
            0 0
        """.trimIndent()
        val expected = """
            The property will be flooded in hour 1.
            The property will be flooded in hour 20.
        """.trimIndent()

        No6696().solve(given.reader().buffered()) shouldBe expected
    }
})

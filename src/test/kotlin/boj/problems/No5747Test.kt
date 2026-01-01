package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5747Test : StringSpec({
    "Odd or Even : https://www.acmicpc.net/problem/5747" {
        val given = """
            3
            1 0 4
            3 1 2
            9
            0 2 2 4 2 1 2 0 4
            1 2 3 4 5 0 1 2 3
            0
        """.trimIndent()
        val expected = """
            0
            3
        """.trimIndent()

        No5747().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3412Test : StringSpec({
    "Darts : https://www.acmicpc.net/problem/3412" {
        val given = """
            1
            5
            32 -39
            71 89
            -60 80
            0 0
            196 89
        """.trimIndent()
        val expected = "29"

        No3412().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8932Test : StringSpec({
    "7종 경기 : https://www.acmicpc.net/problem/8932" {
        val given = """
            3
            19 90 11 29 264 20 131
            12 95 21 37 224 35 221
            17 168 15 23 275 22 241
        """.trimIndent()
        val expected = """
            2901
            3419
            3772
        """.trimIndent()

        No8932().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9506Test : StringSpec({
    "약수들의 합 : https://www.acmicpc.net/problem/9506" {
        val given = """
            6
            12
            28
            -1
        """.trimIndent()
        val expected = """
            6 = 1 + 2 + 3
            12 is NOT perfect.
            28 = 1 + 2 + 4 + 7 + 14
        """.trimIndent()

        No9506().solve(given.reader().buffered()) shouldBe expected
    }
})

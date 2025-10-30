package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9094Test : StringSpec({
    "수학적 호기심 : https://www.acmicpc.net/problem/9094" {
        val given = """
            3
            10 1
            20 3
            30 4
        """.trimIndent()
        val expected = """
            2
            4
            5
        """.trimIndent()

        No9094().solve(given.reader().buffered()) shouldBe expected
    }
})

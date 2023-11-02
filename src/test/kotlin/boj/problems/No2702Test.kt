package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2702Test : StringSpec({
    "초6 수학 : https://www.acmicpc.net/problem/2702" {
        val given = """
            3
            5 10
            7 23
            42 56
        """.trimIndent()
        val expected = """
            10 5
            161 1
            168 14
        """.trimIndent()

        No2702.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})

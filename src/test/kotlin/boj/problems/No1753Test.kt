package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1753Test : StringSpec({
    "최단경로 : https://www.acmicpc.net/problem/1753" {
        val given = """
            5 6
            1
            5 1 1
            1 2 2
            1 3 3
            2 3 4
            2 4 5
            3 4 6
        """.trimIndent()
        val expected = """
            0
            2
            3
            7
            INF
        """.trimIndent()

        No1753().solve(given.reader().buffered()) shouldBe expected
    }
})

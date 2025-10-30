package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1504Test : StringSpec({
    "특정한 최단 경로 : https://www.acmicpc.net/problem/1504" {
        val given = """
            4 6
            1 2 3
            2 3 3
            3 4 1
            1 3 5
            2 4 5
            1 4 4
            2 3
        """.trimIndent()
        val expected = "7"

        No1504().solve(given.reader().buffered()) shouldBe expected
    }
})

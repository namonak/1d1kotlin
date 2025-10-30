package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1966Test : StringSpec({
    "프린터 큐 : https://www.acmicpc.net/problem/1966" {
        val given = """
            3
            1 0
            5
            4 2
            1 2 3 4
            6 0
            1 1 9 1 1 1
        """.trimIndent()
        val expected = """
            1
            2
            5
        """.trimIndent()

        No1966().solve(given.reader().buffered()) shouldBe expected
    }
})

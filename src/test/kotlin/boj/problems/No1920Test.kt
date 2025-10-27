package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1920Test : StringSpec({
    "수 찾기 : https://www.acmicpc.net/problem/1920" {
        val given = """
            5
            4 1 5 2 3
            5
            1 3 7 9 5
        """.trimIndent()
        val expected = """
            1
            1
            0
            0
            1
        """.trimIndent()

        No1920().solve(given.reader().buffered()) shouldBe expected
    }
})

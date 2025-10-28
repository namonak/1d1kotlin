package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10103Test : StringSpec({
    "주사위 게임 : https://www.acmicpc.net/problem/10103" {
        val given = """
            4
            5 6
            6 6
            4 3
            5 2
        """.trimIndent()
        val expected = """
            94
            91
        """.trimIndent()

        No10103().solve(given.reader().buffered()) shouldBe expected
    }
})

package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2563Test : StringSpec({
    "색종이 : https://www.acmicpc.net/problem/2563" {
        val given = """
            3
            3 7
            15 7
            5 2
        """.trimIndent()
        val expected = "260"

        No2563().solve(given.reader().buffered()) shouldBe expected
    }
})

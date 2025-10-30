package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6159Test : StringSpec({
    "Costume Party : https://www.acmicpc.net/problem/6159" {
        val given = """
            4 6
            3
            5
            2
            1
        """.trimIndent()
        val expected = "4"

        No6159().solve(given.reader().buffered()) shouldBe expected
    }
})

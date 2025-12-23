package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24855Test : StringSpec({
    "Natives : https://www.acmicpc.net/problem/24855" {
        val given = """
            6
            2 4 1 3 3 5
        """.trimIndent()
        val expected = "12"

        No24855().solve(given.reader().buffered()) shouldBe expected
    }
})
